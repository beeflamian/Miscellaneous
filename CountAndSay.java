public class CountAndSay {
	static String countAndSay(int n) {
		if (n < 1)
			return "";
		String res = "1";
		for (int i=1; i<n; i++) {
			String cur = "";
			int cnt = 1;
			char ch = res.charAt(0);
			for (int j=1; j<res.length(); j++) {
				char curCh = res.charAt(j);
				if (curCh != ch) {
					cur += Integer.toString(cnt);
					cur += ch;
					ch = curCh;
					cnt = 1;
				} else {
					cnt ++;
				}
			}
			cur += Integer.toString(cnt);
			cur += ch;
			res = cur;
			System.out.println(res);
		}
		return res;
	}
	public static void main(String[] args) {
		countAndSay(0);
	}
}