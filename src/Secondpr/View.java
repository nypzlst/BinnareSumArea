package Secondpr;

import java.io.IOException;

public interface View {
    /** Отображает заголовок */
    public void viewHeader();
    /** Отображает основную часть */
    public void viewBody();
    /** Отображает окончание */
    public void viewFooter();
    /** Отображает объект целиком */
    public void viewShow();
    /** Выполняет инициализацию */
    public void viewInit();



    /** Сохраняет данные для последующего восстановления */
    public void viewSave() throws IOException;

    public void viewRestore() throws Exception;
}
