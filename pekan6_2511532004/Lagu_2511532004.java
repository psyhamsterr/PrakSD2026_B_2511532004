package pekan6_2511532004;

public class Lagu_2511532004{
    // Atribut
    String judul_2004;
    String penyanyi_2004;
    Lagu_2511532004 next_2004;
    Lagu_2511532004 prev_2004;
    
    // Constructor
    public Lagu_2511532004(String judul_2004, String penyanyi_2004) {
        this.judul_2004 = judul_2004;
        this.penyanyi_2004 = penyanyi_2004;
        this.next_2004 = null;
        this.prev_2004 = null;
    }
    
    // Getter
    public String getJudul_2004() {
        return judul_2004;
    }
    
    public String getPenyanyi_2004() {
        return penyanyi_2004;
    }
    
    public Lagu_2511532004 getNext_2004() {
        return next_2004;
    }
    
    public Lagu_2511532004 getPrev_2004() {
        return prev_2004;
    }
    
    // Setter
    public void setJudul_2004(String judul_2004) {
        this.judul_2004 = judul_2004;
    }
    
    public void setPenyanyi_2004(String penyanyi_2004) {
        this.penyanyi_2004 = penyanyi_2004;
    }
    
    public void setNext_2004(Lagu_2511532004 next_2004) {
        this.next_2004 = next_2004;
    }
    
    public void setPrev_2004(Lagu_2511532004 prev_2004) {
        this.prev_2004 = prev_2004;
    }
}