package pekan1_22511532004;

public class Jam_2511532004 {
	private int hh;
	private int mm;
	private int ss;
	
	// VALIDATOR
	
	public static boolean  isValid (int h, int m, int s) {
		return (0 <= h && h <= 23) && (0 <= m && m <= 59) && (0 <= s && s <= 59);
	}
	
	// KONSTRUKOR
	
	public Jam_2511532004(int h, int m, int s)
	{
		this.hh = h; this.mm = m; this.ss = s;
	}
	
	//SELEKTOR
	
	public int getHour() {return hh;}
	public int getMinute () {return mm;}
	public int getSecond () {return ss;}
	
	//MUTATOR
	
	public void setHour (int h) {this.hh=h;}
	public void setMinute (int m) {this.mm=m;}
	public void setSecond (int s) {this.ss=s;}
	
	//KONVERSI
	
	public int toSeconds ()
	{return hh * 3600 + mm * 60 + ss;}	
	public static Jam_2511532004 fromSeconds (int total) {
		if (total < 0) throw new IllegalArgumentException ("detik negatif") ;
		total %= 24 * 3600; 
		int h = total/3600; total %= 3600;
		int m = total / 60; int s = total % 60;
		return new Jam_2511532004(h, m, s);
	}
	
	//RELASIONAL
	
	public int compareTo(Jam_2511532004 other) {return Integer.compare(this.toSeconds(), other.toSeconds());}
	public boolean equals(Object o) {
		if (!(o instanceof Jam_2511532004 j)) return false;
		return hh == j.hh && mm == j.mm && ss == j.ss;
	}
	
	public int hashCode () {return java.util.Objects.hash(hh, mm, ss);}
	
	//ARITMATIKA
	
	public Jam_2511532004 plus (Jam_2511532004 other) {return fromSeconds (this.toSeconds() + other.toSeconds ()); }
	public Jam_2511532004 minus (Jam_2511532004 other) {return fromSeconds (Math.floorMod(this.toSeconds() - other.toSeconds(), 24*3600));}
	public Jam_2511532004 nextSecond () {return fromSeconds (this.toSeconds() + 1 );}
	public Jam_2511532004 nextSeconds (int n) {return fromSeconds (this.toSeconds() + Math.max(0,  n));}
	public Jam_2511532004 prevSecond () {return fromSeconds (Math.floorMod(this.toSeconds() - 1, 24 *3600));}
	public Jam_2511532004 prevSeconds (int n) {return fromSeconds (Math.floorMod (this.toSeconds()-Math.max(0, n),24*3600));}
	
	//Durasi (detik) 
	public static int durasiDetik(Jam_2511532004 jaw,Jam_2511532004 jakh) {return Math.floorMod(jakh.toSeconds() - jaw.toSeconds(), 24 * 3600);}
	//Overiding
	public String toString() {return String.format("%02d:%02d:%02d", hh, mm, ss);} 
	
	
	
	
	
}
