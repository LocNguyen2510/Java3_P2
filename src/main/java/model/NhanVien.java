package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NhanVien {
	@Id
	private String id;
	private String hoVaTen;
	private Date ngaySinh;

	public NhanVien() {

	}

	public NhanVien(String id, String hoVaTen, Date ngaySinh) {

		this.id = id;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
}
