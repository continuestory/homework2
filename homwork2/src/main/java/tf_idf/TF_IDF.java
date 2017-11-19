package tf_idf;
import javafx.util.Pair;
import vo.StockInfo;

import java.util.List;

public interface TF_IDF {
    Pair<String, Double>[] getResult(List<String> words, StockInfo[] stockInfos);
}
