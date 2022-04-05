package Thirdpr;

import java.util.Formatter;
import Secondpr.Item;
import Secondpr.ViewResult;



public class ViewTable extends ViewResult{

    private static final int DEFAULT_WIDTH = 20;
    private int width;

    public ViewTable() {
        width = DEFAULT_WIDTH;
    }

    public ViewTable(int width) {
        this.width = width;
    }


    public ViewTable(int width, int n) {
        super(n);
        this.width = width;
    }
    public int setWidth(int width) {
        return this.width = width;
    }

    public int getWidth() {
        return width;
    }
    private void outLine() {
        for(int i = width; i > 0; i--) {
            System.out.print('-');
        }
    }
    private void outLineLn() {
        outLine();
        System.out.println();
    }

    private void outHeader() {
        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s", "%", (width-3)/2, "s | %", "s\n");
        System.out.printf(fmt.toString(), "Округленые ", "Точные ");
    }

    private void outBody() {
        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s", "%", (width-3)/2, ".0f | %", ".3f\n");
        for(Item item : getItems()) {
            System.out.printf(fmt.toString(), item.getSum(),item.getSum());
        }
    }

    public final void init(int width) { // method overloading
        this.width = width;
        viewInit();
    }

    public final void init(int width, double side) { // method overloading
        this.width = width;
        init(side);
    }

    @Override
    public void init(double side) { // method overriding
        System.out.print("Initialization... ");
        super.init(side);
        System.out.println("done. ");
    }

    @Override
    public void viewHeader() {
        outHeader();
        outLineLn();
    }

    public void viewBody() {
        outBody();
    }

    public void viewFooter() {
        outLineLn();
    }


}
