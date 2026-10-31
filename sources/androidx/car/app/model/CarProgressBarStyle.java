package androidx.car.app.model;

import java.util.Objects;
import p.gvg;
import p.prd;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class CarProgressBarStyle {
    private final CarColor mColor;
    private final int mStrokeCap;
    private final CarColor mTrackColor;

    private CarProgressBarStyle(prd prdVar) {
        this.mColor = prdVar.a;
        this.mTrackColor = prdVar.b;
        this.mStrokeCap = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarProgressBarStyle)) {
            return false;
        }
        CarProgressBarStyle carProgressBarStyle = (CarProgressBarStyle) obj;
        return Objects.equals(this.mColor, carProgressBarStyle.mColor) && Objects.equals(this.mTrackColor, carProgressBarStyle.mTrackColor) && this.mStrokeCap == carProgressBarStyle.mStrokeCap;
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public int getStrokeCap() {
        return this.mStrokeCap;
    }

    public CarColor getTrackColor() {
        return this.mTrackColor;
    }

    public int hashCode() {
        return Objects.hash(this.mColor, this.mTrackColor, Integer.valueOf(this.mStrokeCap));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CarProgressBarStyle{color=");
        sb.append(this.mColor);
        sb.append(", trackColor=");
        sb.append(this.mTrackColor);
        sb.append(", strokeCap=");
        return gvg.j(sb, this.mStrokeCap, "}");
    }

    public /* synthetic */ CarProgressBarStyle(prd prdVar, int i) {
        this(prdVar);
    }

    private CarProgressBarStyle() {
        this.mColor = null;
        this.mTrackColor = null;
        this.mStrokeCap = 0;
    }
}
