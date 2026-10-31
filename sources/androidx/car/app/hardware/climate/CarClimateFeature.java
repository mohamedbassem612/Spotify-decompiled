package androidx.car.app.hardware.climate;

import androidx.car.app.hardware.common.CarZone;
import java.util.List;
import java.util.Objects;
import p.ppd;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class CarClimateFeature {
    private final List<CarZone> mCarZones;
    private final int mFeature;

    public CarClimateFeature(ppd ppdVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CarClimateFeature.class == obj.getClass()) {
            CarClimateFeature carClimateFeature = (CarClimateFeature) obj;
            if (Integer.valueOf(this.mFeature).equals(Integer.valueOf(carClimateFeature.mFeature)) && Objects.equals(this.mCarZones, carClimateFeature.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    public List<CarZone> getCarZones() {
        return this.mCarZones;
    }

    public int getFeature() {
        return this.mFeature;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mFeature), this.mCarZones);
    }

    public String toString() {
        return "ClimateProfileFeature{mFeature='" + this.mFeature + "', mCarZones=" + this.mCarZones + '}';
    }
}
