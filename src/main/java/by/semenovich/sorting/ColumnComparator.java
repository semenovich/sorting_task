package by.semenovich.sorting;

public class ColumnComparator implements java.util.Comparator<String> {

    @Override
    public int compare(String first, String second) {
        if (first.equals(second)) {
            return 0;
        }

        if (first.isEmpty() && !second.isEmpty()) {
            if (Character.isDigit(second.charAt(0))) {
                return 1;
            }
            if (Character.isLetter(second.charAt(0))) {
                return -1;
            }
        }
        if (!first.isEmpty() && second.isEmpty()) {
            if (Character.isDigit(first.charAt(0))) {
                return 1;
            }
            if (Character.isLetter(first.charAt(0))) {
                return -1;
            }
        }

        return compareByNaturalOrder(first, second);
    }

    private int compareByNaturalOrder(String first, String second) {
        int indexOfFirst = 0;
        int indexOfSecond = 0;

        char charOfFist;
        char charOfSecond;

        int comparingResult = 0;

        for (;indexOfFirst < first.length() && indexOfSecond < second.length() && comparingResult == 0;
             indexOfFirst++, indexOfSecond++) {

            charOfFist = first.charAt(indexOfFirst);
            charOfSecond = second.charAt(indexOfSecond);

            if (Character.isDigit(charOfFist) && Character.isDigit(charOfSecond)) {
                String numberOfFirst = "";
                String numberOfSecond = "";

                for (; indexOfFirst < first.length(); indexOfFirst++) {
                    charOfFist = first.charAt(indexOfFirst);
                    if (Character.isDigit(charOfFist)) {
                        numberOfFirst += charOfFist;
                    } else {
                        indexOfFirst--;
                        charOfFist = first.charAt(indexOfFirst);
                        break;
                    }

                }

                for (; indexOfSecond < second.length(); indexOfSecond++) {
                    charOfSecond = second.charAt(indexOfSecond);
                    if (Character.isDigit(charOfSecond)) {
                        numberOfSecond += charOfSecond;
                    } else {
                        indexOfSecond--;
                        charOfSecond = second.charAt(indexOfSecond);
                        break;
                    }

                }

                comparingResult = Integer.compare(Integer.parseInt(numberOfFirst), Integer.parseInt(numberOfSecond));

            }

            if (Character.isDigit(charOfFist) && Character.isLetter(charOfSecond)) {
                comparingResult = -1;
            }
            if (Character.isLetter(charOfFist) && Character.isDigit(charOfSecond)) {
                comparingResult = 1;
            }

            if (Character.isDigit(charOfFist) && !Character.isLetterOrDigit(charOfSecond)) {
                comparingResult = -1;
            }
            if (!Character.isLetterOrDigit(charOfFist) && Character.isDigit(charOfSecond)) {
                comparingResult = 1;
            }

            if (!Character.isLetterOrDigit(charOfFist) && Character.isLetter(charOfSecond)) {
                comparingResult = -1;
            }
            if (Character.isLetter(charOfFist) && !Character.isLetterOrDigit(charOfSecond)) {
                comparingResult = 1;
            }

            if ((!Character.isLetterOrDigit(charOfFist) && !Character.isLetterOrDigit(charOfSecond))
                    || (Character.isLetter(charOfFist) && Character.isLetter(charOfSecond))) {

                comparingResult = ("" + charOfFist).compareTo("" + charOfSecond);

            }

        }

        if (comparingResult == 0) {
            comparingResult = Integer.compare(first.length(), second.length());
        }

        return comparingResult;
    }

}
