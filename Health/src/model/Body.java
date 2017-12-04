package model;

import java.util.Objects;

public class Body {
    private float weight;
    private float height;
    private float waist;
    private float chest;
    private float rightArm;
    private float leftArm;
    private float rightLeg;
    private float leftLeg;
    private float neck;

    public Body(float weight, float height) {
        this.weight = weight;
        this.height = height;
        this.chest = -1;
        this.leftArm = -1;
        this.rightArm = -1;
        this.leftLeg = -1;
        this.rightLeg = -1;
        this.waist = -1;
        this.neck = -1;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWaist() {
        return waist;
    }

    public void setWaist(float waist) {
        this.waist = waist;
    }

    public float getChest() {
        return chest;
    }

    public void setChest(float chest) {
        this.chest = chest;
    }

    public float getRightArm() {
        return rightArm;
    }

    public void setRightArm(float rightArm) {
        this.rightArm = rightArm;
    }

    public float getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(float leftArm) {
        this.leftArm = leftArm;
    }

    public float getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(float rightLeg) {
        this.rightLeg = rightLeg;
    }

    public float getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(float leftLeg) {
        this.leftLeg = leftLeg;
    }

    public float getNeck() {
        return neck;
    }

    public void setNeck(float neck) {
        this.neck = neck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Body)) return false;
        Body body = (Body) o;
        return Float.compare(body.getWeight(), getWeight()) == 0 &&
                Float.compare(body.getHeight(), getHeight()) == 0 &&
                Float.compare(body.getWaist(), getWaist()) == 0 &&
                Float.compare(body.getChest(), getChest()) == 0 &&
                Float.compare(body.getRightArm(), getRightArm()) == 0 &&
                Float.compare(body.getLeftArm(), getLeftArm()) == 0 &&
                Float.compare(body.getRightLeg(), getRightLeg()) == 0 &&
                Float.compare(body.getLeftLeg(), getLeftLeg()) == 0 &&
                Float.compare(body.getNeck(), getNeck()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getHeight(), getWaist(), getChest(), getRightArm(), getLeftArm(), getRightLeg(), getLeftLeg(), getNeck());
    }
}

