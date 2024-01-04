package ac.weekly.js;

public class Barcode {

    private String barcode; // 10자리 숫자형 문자열

    public Barcode() {
        BarcodeStorage bs = new BarcodeStorage(); // 바코드 저장소
        String newBarcode = String.valueOf((int) (Math.random() * 899999999) + 1000000000);
        for (int i = 0; i < bs.getBarcodeList().size(); i++) {
            if (!bs.getBarcodeList().get(i).contains(newBarcode)) { // 바코드
                this.barcode = newBarcode;
                bs.setBarcodeList(newBarcode);
            }
        }
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
