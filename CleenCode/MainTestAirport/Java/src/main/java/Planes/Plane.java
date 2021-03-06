package Planes;

import java.util.Objects;

abstract public class Plane {
    private String modelPlane;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane(String modelPlane, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.modelPlane = modelPlane;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModelPlane() {
        return modelPlane;
    }

    public int () {
        return maxSpeed;
    }

    public int () {
        return maxFlightDistance;
    }

    public int getMinLoadCapacity() {
        int resultMaxCopacity = this.maxLoadCapacity;
        return resultMaxCopacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + modelPlane + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Plane)) return false;
        Plane plane = (Plane) object;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                modelPlane.equals(plane.modelPlane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelPlane, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
