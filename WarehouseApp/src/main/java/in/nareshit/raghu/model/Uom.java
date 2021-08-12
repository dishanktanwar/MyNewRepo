package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="uom_tab")
public class Uom {
	
	@Id
	@GeneratedValue
	@Column(name="uom_id_col")
	private Integer id;
	
	@Column(name="uom_type_col")
	private String uomType;
	@Column(name="uom_model_col")
	private String uomModel;
	@Column(name="uom_description_col")
	private String description;
	
	
	
	public Uom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Uom(Integer id, String uomType, String uomModel, String description) {
		super();
		this.id = id;
		this.uomType = uomType;
		this.uomModel = uomModel;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUomType() {
		return uomType;
	}
	public void setUomType(String uomType) {
		this.uomType = uomType;
	}
	public String getUomModel() {
		return uomModel;
	}
	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Uom [id=" + id + ", uomType=" + uomType + ", uomModel=" + uomModel + ", description=" + description
				+ "]";
	}
	
	
	
}
