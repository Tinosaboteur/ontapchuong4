package baitapcode;

public class hoaqua {
    protected double giaBan;
    protected String ngayNhap,nguonGocxuatxu;
    protected long soLuong;
    // get method
    public double getGiaBan(){
        return this.giaBan;
    }
    public String getNgayNhap(){
        return this.ngayNhap;
    }
    public String getNguonGocXuatXu(){
        return this.nguonGocxuatxu;
    }
    public long getSoLuong(){
        return this.soLuong;
    }
    // set method
    public void setGiaBan(double giaban){
        this.giaBan = giaban;
    }
    public void setNgayNhap(String ngaynhap){
        this.ngayNhap = ngaynhap;
    }
    public void setNguonGocXuatXu(String nguongocxuatxu){
        this.nguonGocxuatxu = nguongocxuatxu;
    }
    public void setSoLuong(long soluong){
        this.soLuong = soluong;
    }
    public String toString() {
        return this.giaBan +","+ this.ngayNhap +","+ this.nguonGocxuatxu +","+ this.soLuong;
    }
    
}
