public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String waifu;
    private String hobby;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String waifu, String hobby) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.waifu = waifu;
        this.hobby = hobby;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setWaifu(String waifu){
        this.waifu = waifu;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getWaifu(){
        return this.waifu;
    }

    public String getHobby(){
        return this.hobby;
    }
}
