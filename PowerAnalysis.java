public class PowerAnalysis {
    private int[] powerLevels;

    public PowerAnalysis(int[] powerLevels) {
        this.powerLevels = powerLevels;
    }

    public int getSumOfEven() {
        int sumEven = 0;
        for (int power : powerLevels) {
            if (power % 2 == 0) {
                sumEven += power;
            }
        }
        return sumEven;
    }

    public int getSumOfOdd() {
        int sumOdd = 0;
        for (int power : powerLevels) {
            if (power % 2 != 0) {
                sumOdd += power;
            }
        }
        return sumOdd;
    }

    public int getMin() {
        int min = powerLevels[0];
        for (int power : powerLevels) {
            if (power < min) {
                min = power;
            }
        }
        return min;
    }

    public int getMax() {
        int max = powerLevels[0];
        for (int power : powerLevels) {
            if (power > max) {
                max = power;
            }
        }
        return max;
    }
}
