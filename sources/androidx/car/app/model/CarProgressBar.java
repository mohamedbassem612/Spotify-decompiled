package androidx.car.app.model;

import java.util.Objects;
import p.ord;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class CarProgressBar {
    private final float mProgress;
    private final CarProgressBarStyle mStyle;

    public CarProgressBar(ord ordVar) {
        this.mProgress = ordVar.a;
        this.mStyle = ordVar.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarProgressBar)) {
            return false;
        }
        CarProgressBar carProgressBar = (CarProgressBar) obj;
        return this.mProgress == carProgressBar.mProgress && Objects.equals(this.mStyle, carProgressBar.mStyle);
    }

    public float getProgress() {
        return this.mProgress;
    }

    public CarProgressBarStyle getStyle() {
        return this.mStyle;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.mProgress), this.mStyle);
    }

    public String toString() {
        return "[progress: " + this.mProgress + ", style: " + this.mStyle + "]";
    }

    private CarProgressBar() {
        this.mProgress = 0.0f;
        this.mStyle = null;
    }
}
