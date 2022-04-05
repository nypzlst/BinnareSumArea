package Firstpr;

import java.io.*;

public class Calc  {

    /** Содержит реализацию методов для вычисления и отображения результатов.
     * @author Oleksandr Dvoreckii
     * @version 2.0
     */

    /** Имя файла, используемое при сериализации. */
    private static final String FNAME = "Item.bin";

    /** Сохраняет результат вычислений. Объект класса {@linkplain Item} */
    private Item result;

    /** Инициализирует {@linkplain Calc#result} */
    public Calc(){
        result = new Item();
    }


    /** Установить значение {@linkplain Calc#result}
     * @param result - новое значение ссылки на объект {@linkplain Item}
     */
    public void setResult(Item result){
        this.result = result;
    }

    /** Получить значение {@linkplain Calc#result}
     * @return текущее значение ссылки на объект {@linkplain Item}
     */
    public Item getResult(){
        return result;
    }

    /** Вычисляет площадь равносторонего треугольника и квадрата, а так же находит их суммму
     * @param side - значенние стороны.
     * @return результат вычисления функции.
     */
    public  double calc(double side){
        double sideSquare = side * side;
        return  ((Math.sqrt(3)/4)*side*side)+ sideSquare;
    }

    /** Вычисляет значение функции и сохраняет
     * результат в объекте {@linkplain Calc#result}
     * @param side - значенние стороны.
     */
    public double init(double side){
        result.setSum(side);
        return result.setSum(calc(side));
    }

    /** Выводит результат вычислений.**/
    public void show(){
        System.out.print(result);

    }

    /** Сохраняет {@linkplain Calc#result} в файле {@linkplain Calc#FNAME}
     * @throws IOException
     */
    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }
    /** Восстанавливает {@linkplain Calc#result} из файла {@linkplain Calc#FNAME}
     * @throws Exception
     */
    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Item)is.readObject();
        is.close();
    }
}
