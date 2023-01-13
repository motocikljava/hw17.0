public enum Capacity {
    VERY_SMALL(0,10), SMALL(10,25), MEDIUM(40,50), LARGE(60,80), VERY_LARGE(100,120);
    private int from;
    private int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
}