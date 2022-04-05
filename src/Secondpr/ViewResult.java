package Secondpr;

import java.io.*;
import java.util.ArrayList;

public class ViewResult implements View{

    private static final String FNAME = "Item.bin";
    private static final int DEFAULT_NUM = 10;
    private ArrayList<Item> items = new ArrayList<Item>();


    public ViewResult() {
        this(DEFAULT_NUM);
    }

    public ViewResult(int n) {
        for(int ctr = 0; ctr < n; ctr++) {
            items.add(new Item());
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public  double calc(double side){
        double sideSquare = side * side;
        return  ((Math.sqrt(3)/4)*side*side)+ sideSquare;
    }

    public void init(double steepside) {
        double x = 0.0;
        double side =steepside;
        for(Item item : items) {
            item.setSum(calc(side));
            x+= side;
            side +=steepside;
        }
    }
    @Override
    public void viewInit(){
        init(0b010);
    }

    @Override
    public void viewSave() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(items);
        os.flush();
        os.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public void viewRestore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        items = (ArrayList<Item>) is.readObject();
        is.close();
    }
    @Override
    public void viewHeader() {
        System.out.println("Results:");
    }

    @Override
    public void viewBody() {
        for(Item item : items) {
           System.out.printf("%.3f; ",item.getSum());
        }
        System.out.println();
    }

    @Override
    public void viewFooter() {
        System.out.println("End.");
    }
    public void viewShow() {
        viewHeader();
        viewBody();
        viewFooter();
    }

}
