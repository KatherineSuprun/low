package Hall;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientsGroup {

    private final int size;
    private Table table;

    public ClientsGroup(int size) {
        this.size = size;
    }

}
