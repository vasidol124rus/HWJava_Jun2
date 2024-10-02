import java.lang.reflect.Method;
import java.util.Arrays;

public class PrintStringMethodsjava {

    public static void main(String[] args) {
        try {
            Class<?> stringClass = Class.forName("java.lang.String");
            Method[] methods = stringClass.getMethods();

            for (Method method : methods) {
                System.out.println("Метод: " + method.getName());
                System.out.println("Возвращаемый тип: " + method.getReturnType());
                System.out.println("Параметры: " + Arrays.toString(method.getParameterTypes()));
                System.out.println("--------------------");
            }

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
