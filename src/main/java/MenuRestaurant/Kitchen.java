package MenuRestaurant;

import Worker.Cook;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Kitchen {

    private List<Cook> cookers = List.of(
            new Cook("Sponge Bob"),
            new Cook("Lena"),
            new Cook("Kate"));

    private Stove stove = new Stove(2);
    ExecutorService executorService = Executors.newScheduledThreadPool(2);

    public void startCookingProcess(Food food) throws InterruptedException {
        int numberOfDishesToCook = food.getOrderedDishes().size();
        Queue<Cook> forCooking = cookers.stream()
                .limit(numberOfDishesToCook)
                .collect(Collectors.toCollection(ArrayDeque :: new));
        Queue<Food> dishesToCook = new ArrayDeque<>(food.getOrderedDishes().values());


        while (!forCooking.isEmpty() && !dishesToCook.isEmpty()) {
            Cook currentCook = forCooking.poll();
            currentCook.setDishToCook(dishesToCook.poll());
            Queue<States> statesCooking = new ArrayDeque<>(currentCook.getDishToCook().getStates());

            while (!statesCooking.isEmpty()) {
                States current = statesCooking.poll();

                if (current.equals(States.PREPARING)) {
                    Thread thread = new Thread(currentCook::prepareTheProduct);
                    thread.start();
                    thread.join();
                }

                switch (current) {
                    case SAUCE:
                        executorService.submit(currentCook::addSauce);
                        break;
                    case SPICES:
                        executorService.submit(currentCook::addSpecies);
                        break;
                    case ADD_INGREDIENTS:
                        executorService.submit(currentCook::addIngredients);
                        break;
                    case CUT:
                        executorService.submit(currentCook::cut);
                        break;
                    case PACKING:
                        executorService.submit(currentCook::packing);
                        break;
                }
                executorService.shutdown();
            }
        }
    }

    private void useTheStove(Cook currentCook, Food food) throws InterruptedException {
        if (stove.getAvailableSpots() > 0) {
            if (stove.tryToCook()) {
                if (food.getStates().contains(States.FRY)) {
                    currentCook.fry();
                } else {
                    currentCook.bake();
                }
                Thread.sleep(1000);
            }
        }
    }
}
