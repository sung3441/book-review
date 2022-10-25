package ch07.after;

public class ItemType {

    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    private final int typeCode;

    public ItemType(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getTypeCode() {
        return typeCode;
    }
}
