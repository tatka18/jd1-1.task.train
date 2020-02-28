package bean;

public class Train {
	private int numberOfTrain;
	private String nameOfTown;
	private Date date;

	public Train(int numberOfTrain, String nameOfTown, Date date) {
		super();
		this.numberOfTrain = numberOfTrain;
		this.nameOfTown = nameOfTown;
		this.date = date;
	}

	public int getNumberOfTrain() {
		return numberOfTrain;
	}

	public void setNumberOfTrain(int numberOfTrain) {
		this.numberOfTrain = numberOfTrain;
	}

	public String getNameOfTown() {
		return nameOfTown;
	}

	public void setNameOfTown(String nameOfTown) {
		this.nameOfTown = nameOfTown;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((nameOfTown == null) ? 0 : nameOfTown.hashCode());
		result = prime * result + numberOfTrain;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (nameOfTown == null) {
			if (other.nameOfTown != null)
				return false;
		} else if (!nameOfTown.equals(other.nameOfTown))
			return false;
		if (numberOfTrain != other.numberOfTrain)
			return false;
		return true;
	}

	public String toString() {
		return "Train [numberOfTrain=" + numberOfTrain + ", nameOfTown=" + nameOfTown + ", date=" + date + "]";
	}

}
