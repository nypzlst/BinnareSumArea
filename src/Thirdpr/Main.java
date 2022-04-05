package Thirdpr;

import Secondpr.View;


public class Main extends Secondpr.Main {

    public Main(View view){
        super(view);
    }




    public static void main(String[] args){
        Main main = new Main(new ViewableTable().getView());
        main.menu();
    }
}