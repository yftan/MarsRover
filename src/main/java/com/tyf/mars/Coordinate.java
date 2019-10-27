package com.tyf.mars;

import java.util.Objects;

public class Coordinate {
    int x;
    int y;
    String direct;

    public Coordinate(int x, int y, String direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                ", direct='" + direct + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x &&
                y == that.y &&
                direct.equals(that.direct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direct);
    }
}
