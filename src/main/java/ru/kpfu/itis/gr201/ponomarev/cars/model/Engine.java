package ru.kpfu.itis.gr201.ponomarev.cars.model;

public enum Engine {
    GASOLINE(1, "Gasoline"),
    DIESEL(2, "Diesel"),
    GAS(3, "Gas"),
    ELECTRO(4, "Electro"),
    HYBRID(5, "Hybrid");

    private final int id;
    private final String engine;

    Engine(int id, String engine) {
        this.id = id;
        this.engine = engine;
    }

    public static Engine getById(int id) {
        for (Engine engine : values()) {
            if (engine.id == id) return engine;
        }
        return null;
    }

    public static Engine getByName(String name) {
        for (Engine engine : values()) {
            if (engine.engine.equals(name)) return engine;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return engine;
    }
}
