package Fivepr;

import Secondpr.View;
import Secondpr.ViewResult;
import Fourthpr.ChangeConsoleCommand;
import Fourthpr.GenerateConsoleCommand;
import Fourthpr.Menu;
import Fourthpr.ViewConsoleCommand;
import Secondpr.ViewableResult;

public class Main {

    private View view = new ViewableResult().getView();

    private Menu menu = new Menu();

    public void run() {
        menu.add(new ViewConsoleCommand(view));
        menu.add(new GenerateConsoleCommand(view));
        menu.add(new ChangeConsoleCommand(view));
        menu.add(new ExecuteConsoleCommand(view));
        menu.execute();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }


}
