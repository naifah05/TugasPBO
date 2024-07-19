package sortCollection;

class RemoveOddNumbers {
    void removeOddNumbers(int arr[]) {
        // Array untuk menyimpan angka ganjil yang dihapus
        int[] removedOddNumbers = new int[arr.length];
        int removedCount = 0;

        // Menyimpan array tanpa angka ganjil
        int[] tempArr = new int[arr.length];
        int tempCount = 0;

        // Loop melalui elemen-elemen array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                // Jika elemen adalah angka ganjil, simpan di removedOddNumbers
                removedOddNumbers[removedCount++] = arr[i];
            } else {
                // Jika elemen adalah angka genap, simpan di tempArr
                tempArr[tempCount++] = arr[i];
            }
        }

        // Membuat array final tanpa angka ganjil
        int[] newArr = new int[tempCount];
        System.arraycopy(tempArr, 0, newArr, 0, tempCount);

        // Print angka ganjil yang dihapus
        System.out.print("Angka ganjil yang dihapus: ");
        for (int i = 0; i < removedCount; i++) {
            System.out.print(removedOddNumbers[i] + " ");
        }
        System.out.println();

        // Print array tanpa angka ganjil
        System.out.print("Array tanpa angka ganjil: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}
