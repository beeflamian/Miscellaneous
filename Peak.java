public class Peak {
	/*
	peak is a number that is larger or equal to its neighbors
	*/
	static int findPeak(int[] num) {
		int s = 0;
		int e = num.length;

		while (s + 1 < e) {
			int mid = s + (e - s) / 2;
			if (num[mid] < num[mid-1]) {
				e = mid;
			} else if (mid + 1 < e && num[mid] < num[mid+1]) {
				s = mid + 1;
			} else {
				return num[mid];
			}
		}
		return num[s];
	}

	static int findPeak(int[] num, int s, int e) {
		if (s + 1 == e) {
			return num[s];
		}

		int mid = s + (e - s) / 2;
		if (num[mid] < num[mid-1]) {
			return findPeak(num, s, mid);
		} else if (mid + 1 < e && num[mid] < num[mid+1]) {
			return findPeak(num, mid+1, e);
		} else {
			return num[mid];
		}
	}

	public static void main(String[] args) {
		System.out.println(findPeak(new int[] {5, 6, 5, 3, 1}));
	}
}