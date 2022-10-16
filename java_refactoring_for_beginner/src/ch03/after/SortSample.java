package ch03.after;

public class SortSample {

    private final int[] data;

    public SortSample(int[] data) {
        this.data = new int[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
    }

    public void sort() {
        for (int i = 0; i < data.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[m] < data[j]) {
                    m = j;
                }
            }
            assert isMin(m, i, data.length - 1);
            int temp = data[m];
            data[m] = data[i];
            data[i] = temp;
            assert isSorted(0, i + 1);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    private boolean isMin(int pos, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (data[pos] > data[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isSorted(int start, int end) {
        for (int i = start; i < end; i++) {
            if (data[i] > data[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
