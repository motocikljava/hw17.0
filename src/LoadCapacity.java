public enum LoadCapacity {
    N1(0, 3.5),
    N2(3.5, 12),
    N3(12, 15);
    private double from;
    private double to;

    LoadCapacity(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }
}