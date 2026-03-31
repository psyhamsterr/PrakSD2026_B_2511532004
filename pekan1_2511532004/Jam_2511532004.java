package pekan1_2511532004;

public class jam_2511532004 {


						public static void main(String[] args) {
			public final class Jam  {
				private int hh; // 0..23
				private int mm; // 0..59
				private int ss; // 0..59
		
			public static boolean isValid(int h, int m, int s) {
				return (0 <= h && h <= 23) && (0 <= m && m <= 59) && (0 <= S && S <= 59);
			}

			public Jam(int h, int m, int s) {
				this.hh = h; this.mm = m; this.ss = s;
			}
			
			//---Selector---
			public int getHour() { return hh; }
			public int getMinute() { return mm; }
			public int getSecond() { return ss; }
			
			//---Mutator---
			public void setHour(int h) {this.hh = h; }
			public void setMinute(int m) {this.mm = m; }
			public void setSecond(int s) {this.ss = s; }
			
			//---Konversi---
			public int  toSeconds() { return hh * 3600 + mm * 60 * ss; }
			public static Jam fromSeconds(int total) {
				if (total < 0) throw new IllegalArgumentException
				
			}

			
			}

		}

	}
