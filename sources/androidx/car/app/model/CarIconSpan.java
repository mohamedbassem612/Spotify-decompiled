package androidx.car.app.model;

import java.util.Objects;
import p.eg;
import p.f4i1;
import p.l1d;
import p.qrd;
import p.yo31;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final CarIcon mIcon;

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }

    private static String alignmentToString(int i) {
        if (i == 0) {
            return "bottom";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "center";
        }
        return "baseline";
    }

    public static CarIconSpan create(CarIcon carIcon, int i) {
        yo31.f.j(carIcon);
        if (i == 1 || i == 0 || i == 2) {
            Objects.requireNonNull(carIcon);
            return new CarIconSpan(carIcon, i);
        }
        eg.m(f4i1.c(i, "Invalid alignment value: "));
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarIconSpan) {
            return Objects.equals(this.mIcon, ((CarIconSpan) obj).mIcon);
        }
        return false;
    }

    public int getAlignment() {
        return this.mAlignment;
    }

    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        Objects.requireNonNull(carIcon);
        return carIcon;
    }

    public int hashCode() {
        return Objects.hashCode(this.mIcon);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[icon: ");
        sb.append(this.mIcon);
        sb.append(", alignment: ");
        return l1d.n(alignmentToString(this.mAlignment), "]", sb);
    }

    private CarIconSpan(CarIcon carIcon, int i) {
        this.mIcon = carIcon;
        this.mAlignment = i;
    }

    public static CarIconSpan create(CarIcon carIcon) {
        return create(carIcon, 1);
    }
}
