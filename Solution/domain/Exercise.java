package domain;

public class Exercise {

    /**
     * Генерує масив із заданим розміром.
     *
     * @param size розмір масиву (повинен бути > 0)
     * @return заповнений масив
     */
    public static int[] calculate(int size) {

        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0");
        }

        int[] array = new int[size];
        int center = size / 2;

        for (int i = 0; i < size; i++) {
            array[i] = Math.abs(i - center);
        }

        return array;
    }
}