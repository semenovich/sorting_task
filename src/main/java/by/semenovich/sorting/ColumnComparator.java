package by.semenovich.sorting;

public class ColumnComparator implements java.util.Comparator<String> {

    @Override
    public int compare(String first, String second) {
        if (first.equals(second)) {
            return 0;
        }

        boolean isFirstNumber = isNumber(first);
        boolean isSecondNumber = isNumber(second);

        if (isFirstNumber && isSecondNumber) {
            return Double.compare(Double.parseDouble(first), Double.parseDouble(second));
        }

        if (isFirstNumber && !isSecondNumber) {
            return -1;
        }

        if (!isFirstNumber && isSecondNumber) {
            return 1;
        }

        if (first.isEmpty() && !second.isEmpty()) {
            return -1;
        }

        if (!first.isEmpty() && second.isEmpty()) {
            return 1;
        }

        return first.compareTo(second);
    }

    private boolean isNumber(String str) {
        if (str == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
