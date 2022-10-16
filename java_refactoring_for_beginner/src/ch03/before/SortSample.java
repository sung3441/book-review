package ch03.before;

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
            // data[m]은 data[i] ~ data[data.length - 1]의 최솟값이어야 함
            int temp = data[m];
            data[m] = data[i];
            data[i] = temp;
            // data[0] ~ data[i + 1]은 이미 정렬되어 있음
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
}
