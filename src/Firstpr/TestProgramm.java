package Firstpr;
import org.junit.*;
import java.util.Scanner;

/** Выполняет тестирование разработанных классов.
 * @author Oleksandr Dvoreckii
 * @version 2.0
 */
public class TestProgramm {
    /** Проверка основной функциональности класса {@linkplain Calc} */
   @Test
    public void TestCalc(){

        System.out.println("Testing calculating sum of triangel and squre");

        System.out.println("Enter byte number of the side :");

        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();

        double Sum = ((Math.sqrt(3)/4)*side*side) +(side +side);
        System.out.println("Sum== "+ Sum);
    }


}
