public class Pegawai {
    protected int tarifp;

    public static void main (String [] args){
        Supervisor supervisor = new Supervisor();
        Staff staff = new Staff();
        Gaji gaji = new Gaji();

        gaji.menghitungGaji(supervisor.tarifp);
        gaji.menghitungGaji(staff.tarifp);
    }
}
