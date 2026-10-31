package androidx.car.app.model;

import java.util.Objects;
import p.qpd;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class ForegroundCarColorSpan extends CarSpan {
    private final CarColor mCarColor;

    private ForegroundCarColorSpan() {
        this.mCarColor = CarColor.DEFAULT;
    }

    public static ForegroundCarColorSpan create(CarColor carColor) {
        qpd.b.a(carColor);
        return new ForegroundCarColorSpan(carColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForegroundCarColorSpan) {
            return Objects.equals(this.mCarColor, ((ForegroundCarColorSpan) obj).mCarColor);
        }
        return false;
    }

    public CarColor getColor() {
        return this.mCarColor;
    }

    public int hashCode() {
        return Objects.hashCode(this.mCarColor);
    }

    public String toString() {
        return "[color: " + this.mCarColor + "]";
    }

    private ForegroundCarColorSpan(CarColor carColor) {
        this.mCarColor = carColor;
    }
}
