package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CuocHop {
	@Id
	@GeneratedValue
	private int id;
	private String tenCuocHop;
	private String diaDiem;
	private Date thoiGian;

	public CuocHop() {

	}

	public CuocHop(int id, String tenCuocHop, String diaDiem, Date thoiGian) {

		this.id = id;
		this.tenCuocHop = tenCuocHop;
		this.diaDiem = diaDiem;
		this.thoiGian = thoiGian;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenCuocHop() {
		return tenCuocHop;
	}

	public void setTenCuocHop(String tenCuocHop) {
		this.tenCuocHop = tenCuocHop;
	}

	public String getDiaDiem() {
		return diaDiem;
	}

	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}

	public Date getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}
}
