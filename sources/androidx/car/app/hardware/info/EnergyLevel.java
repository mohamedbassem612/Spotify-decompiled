package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;
import p.d6y;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class EnergyLevel {
    private final CarValue<Float> mBatteryPercent;
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Boolean> mEnergyIsLow;
    private final CarValue<Float> mFuelPercent;
    private final CarValue<Integer> mFuelVolumeDisplayUnit;
    private final CarValue<Float> mRangeRemainingMeters;

    public EnergyLevel(d6y d6yVar) {
        CarValue<Float> carValue = d6yVar.a;
        Objects.requireNonNull(carValue);
        this.mBatteryPercent = carValue;
        CarValue<Float> carValue2 = d6yVar.b;
        Objects.requireNonNull(carValue2);
        this.mFuelPercent = carValue2;
        CarValue<Boolean> carValue3 = d6yVar.c;
        Objects.requireNonNull(carValue3);
        this.mEnergyIsLow = carValue3;
        CarValue<Float> carValue4 = d6yVar.d;
        Objects.requireNonNull(carValue4);
        this.mRangeRemainingMeters = carValue4;
        CarValue<Integer> carValue5 = d6yVar.e;
        Objects.requireNonNull(carValue5);
        this.mDistanceDisplayUnit = carValue5;
        CarValue<Integer> carValue6 = d6yVar.f;
        Objects.requireNonNull(carValue6);
        this.mFuelVolumeDisplayUnit = carValue6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyLevel)) {
            return false;
        }
        EnergyLevel energyLevel = (EnergyLevel) obj;
        return Objects.equals(this.mBatteryPercent, energyLevel.mBatteryPercent) && Objects.equals(this.mFuelPercent, energyLevel.mFuelPercent) && Objects.equals(this.mEnergyIsLow, energyLevel.mEnergyIsLow) && Objects.equals(getRangeRemainingMeters(), energyLevel.getRangeRemainingMeters()) && Objects.equals(this.mDistanceDisplayUnit, energyLevel.mDistanceDisplayUnit) && Objects.equals(this.mFuelVolumeDisplayUnit, energyLevel.mFuelVolumeDisplayUnit);
    }

    public CarValue<Float> getBatteryPercent() {
        CarValue<Float> carValue = this.mBatteryPercent;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Boolean> getEnergyIsLow() {
        CarValue<Boolean> carValue = this.mEnergyIsLow;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getFuelPercent() {
        CarValue<Float> carValue = this.mFuelPercent;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getFuelVolumeDisplayUnit() {
        CarValue<Integer> carValue = this.mFuelVolumeDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getRangeRemainingMeters() {
        CarValue<Float> carValue = this.mRangeRemainingMeters;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mBatteryPercent, this.mFuelPercent, this.mEnergyIsLow, getRangeRemainingMeters(), this.mDistanceDisplayUnit, this.mFuelVolumeDisplayUnit);
    }

    public String toString() {
        return "[ battery percent: " + this.mBatteryPercent + ", fuel percent: " + this.mFuelPercent + ", energyIsLow: " + this.mEnergyIsLow + ", range remaining: " + getRangeRemainingMeters() + ", distance display unit: " + this.mDistanceDisplayUnit + ", fuel volume display unit: " + this.mFuelVolumeDisplayUnit + "]";
    }

    private EnergyLevel() {
        CarValue<Float> carValue = CarValue.UNKNOWN_FLOAT;
        this.mBatteryPercent = carValue;
        this.mFuelPercent = carValue;
        this.mEnergyIsLow = CarValue.UNKNOWN_BOOLEAN;
        this.mRangeRemainingMeters = carValue;
        CarValue<Integer> carValue2 = CarValue.UNKNOWN_INTEGER;
        this.mDistanceDisplayUnit = carValue2;
        this.mFuelVolumeDisplayUnit = carValue2;
    }
}
