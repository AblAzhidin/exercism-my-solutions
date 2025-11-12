public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private int id;

    LogLevel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
