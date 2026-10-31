package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;
import p.qrd;
import p.zrj0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Mileage {
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Float> mOdometerMeters;

    public Mileage(zrj0 zrj0Var) {
        CarValue<Float> carValue = zrj0Var.a;
        Objects.requireNonNull(carValue);
        this.mOdometerMeters = carValue;
        CarValue<Integer> carValue2 = zrj0Var.b;
        Objects.requireNonNull(carValue2);
        this.mDistanceDisplayUnit = carValue2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        return Objects.equals(getOdometerInKilometers(), mileage.getOdometerInKilometers()) && Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getOdometerInKilometers() {
        CarValue<Float> carValue = this.mOdometerMeters;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    @Deprecated
    public CarValue<Float> getOdometerMeters() {
        return getOdometerInKilometers();
    }

    public int hashCode() {
        return Objects.hash(getOdometerInKilometers(), this.mDistanceDisplayUnit);
    }

    public String toString() {
        return "[ odometer: " + getOdometerInKilometers() + ", distance display unit: " + this.mDistanceDisplayUnit + "]";
    }

    private Mileage() {
        this.mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }
}
