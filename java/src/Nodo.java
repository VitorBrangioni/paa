class Nodo {

    private int number;
    private Nodo next;
    private Nodo before;
    
    public Nodo(int number) {
        this.number = number;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void setBefore(Nodo before) {
        this.before = before;
    }

    public Nodo getNext() {
        return this.next;
    }

    public Nodo getBefore() {
        return this.before;
    }

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

}