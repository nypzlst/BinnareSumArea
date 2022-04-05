package Fourthpr;

import Secondpr.Item;

public class ChangeItemCommand implements Command{

    private Item item;
    private double offset;

    public Item setItem(Item item) {
        return this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public double setOffset(double offset) {
        return this.offset = offset;
    }

    public double getOffset() {
        return offset;
    }

    @Override
    public void execute() {
            item.setSum(item.getSum()*offset);
    }

}
