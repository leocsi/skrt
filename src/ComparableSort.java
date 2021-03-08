import java.lang.reflect.Type;
import java.util.Comparator;

public class ComparableSort<T> {
    public Comparable[] comparableBubbleSort(Comparable[] array) {
        for (int i = 1; i < array.length-1;i++){
            for (int j = array.length-1; j >= i; j--){
                Comparable current = array[j];
                Comparable previous = array[j-1];
                int result = Comparator.naturalOrder().compare(current, previous);
                if(result <=0){
                    array[j-1] = current;
                    array[j] = previous;
                }
            }
        }
        return array;
    }
}
