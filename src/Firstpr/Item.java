package Firstpr;

import java.io.Serializable;

public class Item implements Serializable {

    /** Хранит исходные данные и результат вычислений.
     * @author Oleksandr Dvoreckii
     * @version 2.0
     */
    /** Аргумент вычисляемой функции. **/
    private double side;

    /** Автоматически сгенерированная константа */
    private static final long serialVersionUID = 1L;
    /** Инициализирует поля {@linkplain Item#side} */
    public Item(){
        side = 0;
    }
    /** Устанавливает значения полей: аргумента
     * и результата вычисления функции.
     * @param side - значение для инициализации поля {@linkplain Item#side}
     */
    public Item(double side){
        this.side= side;
    //    this.sum = sum;
    }
    /** Установка значения поля {@linkplain Item#side}
     * @param side - значение для {@linkplain Item#side}
     * @return Значение {@linkplain Item#side}
     */
    public double setSum(double side){
            return this.side = side;
    }
    /** Получение значения поля {@linkplain Item#side}
     * @return Значение {@linkplain Item#side}
     */
    public double getSum(double side){
        return this.side = side;
    }
    /** Представляет результат вычислений в виде строки.<br>{@inheritDoc} */
    @Override
    public String toString(){
        return "Sum = " + side;
    }
    /** Автоматически сгенерированный метод.<br>{@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Item other = (Item) obj;
        if (Double.doubleToLongBits(side) != Double.doubleToLongBits(other.side))
            return false;
        return true;
    }
}
