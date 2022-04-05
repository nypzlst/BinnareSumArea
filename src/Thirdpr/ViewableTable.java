package Thirdpr;

import Secondpr.ViewableResult;
import Secondpr.View;

public class ViewableTable extends ViewableResult {

    @Override
    public View getView() {
        return new ViewTable();
    }
}
