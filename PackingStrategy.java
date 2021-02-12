import java.util.*;

public interface PackingStrategy {
    public int itemPlace(List<Integer> bins,
                         int binCapacity,
                         int itemSize);
}
