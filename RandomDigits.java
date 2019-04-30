public static int[] generateRandomDigits(int low, int high, int size) {
		int[] digits = new int[size];
		for (int i = 0; i < size; i++) {
			digits[i] = findRandom(low, high);
		}
		return digits;
}

public static int findRandom(int low, int high) {
    int randomInt = (int)(Math.random() * high) + low;
    return randomInt;
}
