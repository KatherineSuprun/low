package Hall;

class Table implements Comparable<Table> {
    private final int size;      // number of chairs
    private int freeSpace;

    public Table(int size) {
        this.size = size;
        this.freeSpace = size;
    }

    public int getSize() {
        return size;
    }

    public int getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = this.freeSpace - freeSpace;
    }

    @Override
    public int compareTo(Table table) {
        boolean isEmpty1 = this.getFreeSpace() == this.getSize();
        boolean isEmpty2 = table.getFreeSpace() == table.getSize();
        //Prior to empty tables
        if (!isEmpty1 && isEmpty2) {
            return 1;
        } else if (isEmpty1 && !isEmpty2) {
            return -1;
        } else {
            if (this.getFreeSpace() == 0) {
                return 1;
            } else if (table.getFreeSpace() == 0) {
                return -1;
            } else {
                if (this.getFreeSpace() - table.getFreeSpace() == 0) {
                    return this.getSize() - table.getSize();
                } else {
                    return this.getFreeSpace() - table.getFreeSpace();
                }
            }
        }
    }
}





