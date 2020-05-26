package by.semenovich.sorting;

import java.util.Comparator;

public class RowComparator implements Comparator<String[]> {

    private Comparator<String> stringComparator = new ColumnComparator();

    @Override
    public int compare(String[] firstRow, String[] secondRow) {
        int comparingResult = 0;

        for (int i = 0; i < firstRow.length && i < secondRow.length && comparingResult == 0; i++) {
            comparingResult = stringComparator.compare(firstRow[i], secondRow[i]);
        }

        return comparingResult;
    }

}
