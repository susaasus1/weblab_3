package com.example.weblab_3.points;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Point implements Serializable {
    @Id
    @SequenceGenerator(name = "jpaSequence", sequenceName = "JPA_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jpaSequence")
    private int id;
    private Double xValue;
    private Double yValue;
    private Integer rValue;
    private String hitResult;

    public Point() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getxValue() {
        return xValue;
    }

    public void setxValue(Double xValue) {
        this.xValue = xValue;
    }

    public Double getyValue() {
        return yValue;
    }

    public void setyValue(Double yValue) {
        this.yValue = yValue;
    }

    public Integer getrValue() {
        return rValue;
    }

    public void setrValue(Integer rValue) {
        this.rValue = rValue;
    }

    public String getHitResult() {
        return hitResult;
    }

    public void setHitResult(String hitResult) {
        this.hitResult = hitResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return id == point.id && Objects.equals(xValue, point.xValue) && Objects.equals(yValue, point.yValue) && Objects.equals(rValue, point.rValue) && Objects.equals(hitResult, point.hitResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, xValue, yValue, rValue, hitResult);
    }

    @Override
    public String toString() {
        return "Point{" +
                "id=" + id +
                ", xValue=" + xValue +
                ", yValue=" + yValue +
                ", rValue=" + rValue +
                ", hitResult='" + hitResult + '\'' +
                '}';
    }
}
