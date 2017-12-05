package Health.registry;

import java.util.HashMap;
import java.util.Map;

public class measuremens {
    private Map<Long, Float> waist = new HashMap<>();
    private Map<Long, Float> chest = new HashMap<>();
    private Map<Long, Float> rightArm = new HashMap<>();
    private Map<Long, Float> leftArm = new HashMap<>();
    private Map<Long, Float> rightLeg = new HashMap<>();
    private Map<Long, Float> leftLeg = new HashMap<>();
    private Map<Long, Float> weight = new HashMap<>();

    public void updateWeight(float n) {
        weight.put(System.currentTimeMillis(), n);
    }

    public void updateWaist(float n) {
        waist.put(System.currentTimeMillis(), n);
    }

    public void updateChest(float n) {
        chest.put(System.currentTimeMillis(), n);
    }

    public void updateRightArm(float n) {
        rightArm.put(System.currentTimeMillis(), n);
    }

    public void updateLeftArm(float n) {
        leftArm.put(System.currentTimeMillis(), n);
    }

    public void updateRightLeg(float n) {
        rightLeg.put(System.currentTimeMillis(), n);
    }

    public void updateLeftLeg(float n) {
        leftLeg.put(System.currentTimeMillis(), n);
    }

    public Map<Long, Float> getWheight() {
        return weight;
    }

    public Map<Long, Float> getWaist() {
        return waist;
    }

    public Map<Long, Float> getChest() {
        return chest;
    }

    public Map<Long, Float> getRightArm() {
        return rightArm;
    }

    public Map<Long, Float> getLeftArm() {
        return leftArm;
    }

    public Map<Long, Float> getRightLeg() {
        return rightLeg;
    }

    public Map<Long, Float> getLeftLeg() {
        return leftLeg;
    }
}
