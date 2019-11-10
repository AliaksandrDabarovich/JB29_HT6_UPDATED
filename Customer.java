package by.ad.les09_8.bean;

public class Customer {
	private int id;
	private String fio;
	private String adress;
	private int cardnumber;
	private int banknumber;

	public Customer(int id, String fio, String adress, int cardnumber, int banknumber) {
		this.id = id;
		this.fio = fio;
		this.adress = adress;
		this.cardnumber = cardnumber;
		this.banknumber = banknumber;
	}

	public Customer() {
		this.id = 0;
		this.fio = "";
		this.adress = "";
		this.cardnumber = 0;
		this.banknumber = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}

	public int getBanknumber() {
		return banknumber;
	}

	public void setBanknumber(int banknumber) {
		this.banknumber = banknumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fio=" + fio + ", adress=" + adress + ", cardnumber=" + cardnumber
				+ ", banknumber=" + banknumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + banknumber;
		result = prime * result + cardnumber;
		result = prime * result + ((fio == null) ? 0 : fio.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (banknumber != other.banknumber)
			return false;
		if (cardnumber != other.cardnumber)
			return false;
		if (fio == null) {
			if (other.fio != null)
				return false;
		} else if (!fio.equals(other.fio))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	

}
