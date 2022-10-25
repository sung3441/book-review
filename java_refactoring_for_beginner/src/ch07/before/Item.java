package ch07.before;

public class Item {

    public static final int TYPE_CODE_BOOK = 0;
    public static final int TYPE_CODE_DVD = 1;
    public static final int TYPE_CODE_SOFTWARE = 2;

    private final int typeCode;
    private final String title;
    private final int price;

    public Item(int typeCode, String title, int price) {
        this.typeCode = typeCode;
        this.title = title;
        this.price = price;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[ "
                + getTypeCode() + ", "
                + getTitle() + ", "
                + getPrice() + " ]";
    }
}
