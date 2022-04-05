package Fourthpr;

import Secondpr.Item;
import Secondpr.View;
import Secondpr.ViewResult;

public class ChangeConsoleCommand
        extends  ChangeItemCommand
        implements ConsoleCommand{

    private View view;
    public View getView() {
        return view;
    }

    public ChangeConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public char getKey() {
        return 'c';
    }

    @Override
    public String toString() {
        return "'c'hange";
    }

    @Override
    public void execute() {
        System.out.println("Change item: scale factor " + setOffset(Math.random() * 100.0));
        for (Item item : ((ViewResult)view).getItems()) {
            super.setItem(item);
            super.execute();
        }
        view.viewShow();

    }



}
