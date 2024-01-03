package ac.weekly;

import java.util.ArrayList;
import java.util.List;

public class BarcodeStorage {

    List<String> barcodeList = new ArrayList<>();

    public List<String> getBarcodeList() {
        return barcodeList;
    }

    public void setBarcodeList(String barcodeList) {
        this.barcodeList.add(barcodeList);
    }
}
