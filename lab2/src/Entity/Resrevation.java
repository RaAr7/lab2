package Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the resrevation database table.
 * 
 */
@Entity
@NamedQuery(name="Resrevation.findAll", query="SELECT r FROM Resrevation r")
public class Resrevation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(name="payment_type")
	private Integer paymentType;

	private Integer statuse;

	//bi-directional one-to-one association to ChargePayment
	@OneToOne
	@JoinColumn(name="payment_id")
	private ChargePayment chargePayment;

	//bi-directional many-to-one association to Enduser
	@ManyToOne
	private Enduser enduser;

	//bi-directional many-to-one association to Expriment
	@ManyToOne
	@JoinColumn(name="exp_id")
	private Expriment expriment;

	//bi-directional one-to-one association to OnlinePayment
	@OneToOne
	@JoinColumn(name="payment_id")
	private OnlinePayment onlinePayment;

	public Resrevation() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}

	public Integer getStatuse() {
		return this.statuse;
	}

	public void setStatuse(Integer statuse) {
		this.statuse = statuse;
	}

	public ChargePayment getChargePayment() {
		return this.chargePayment;
	}

	public void setChargePayment(ChargePayment chargePayment) {
		this.chargePayment = chargePayment;
	}

	public Enduser getEnduser() {
		return this.enduser;
	}

	public void setEnduser(Enduser enduser) {
		this.enduser = enduser;
	}

	public Expriment getExpriment() {
		return this.expriment;
	}

	public void setExpriment(Expriment expriment) {
		this.expriment = expriment;
	}

	public OnlinePayment getOnlinePayment() {
		return this.onlinePayment;
	}

	public void setOnlinePayment(OnlinePayment onlinePayment) {
		this.onlinePayment = onlinePayment;
	}

}