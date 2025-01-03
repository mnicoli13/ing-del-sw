// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

/************************************************************/
package IngDelSw.nicoli.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 */
@Entity
@Table(name = "products")
public class Products {
	/**
	 *
	 */
	@Id
	@Column(name = "product_id")
	private int product_id;
	/**
	 *
	 */
	@Column(name = "product_name")
	private String product_name;
	/**
	 *
	 */
	@Column(name = "treated_area_id")
	private int treated_area_id;

	/**
	 * GETTERS AND SETTERS
	 */
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getTreatedarea() {
		return treated_area_id;
	}

	public void setTreatedarea(int treatedarea) {
		this.treated_area_id = treatedarea;
	}
}
