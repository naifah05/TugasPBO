package sortCollection;

public class FindTheSmallest {
    int[] findsmallest(int[]arr){
        int i;

        // Inisialisasi elemen minimum
        int min = arr[0];

        // bandingkan setiap elemen dengan min saat ini
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return new int[]{min};
    }

}
