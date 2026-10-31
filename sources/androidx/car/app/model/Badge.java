package androidx.car.app.model;

import java.util.Objects;
import p.qrd;
import p.w0a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class Badge {
    private final CarColor mDotColor;
    private final boolean mHasDot;
    private final CarIcon mIcon;
    private final CarColor mIconBackgroundColor;

    private Badge() {
        this.mHasDot = false;
        this.mDotColor = null;
        this.mIcon = null;
        this.mIconBackgroundColor = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.mHasDot == badge.mHasDot && Objects.equals(this.mDotColor, badge.mDotColor) && Objects.equals(this.mIcon, badge.mIcon) && Objects.equals(this.mIconBackgroundColor, badge.mIconBackgroundColor);
    }

    @Deprecated
    public CarColor getBackgroundColor() {
        return this.mDotColor;
    }

    public CarColor getDotColor() {
        return this.mDotColor;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarColor getIconBackgroundColor() {
        return this.mIconBackgroundColor;
    }

    public boolean hasDot() {
        return this.mHasDot;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mHasDot), this.mDotColor, this.mIcon, this.mIconBackgroundColor);
    }

    public String toString() {
        return "[hasDot: " + this.mHasDot + ", dotColor: " + this.mDotColor + ", icon: " + this.mIcon + ", iconBackgroundColor: " + this.mIconBackgroundColor + "]";
    }

    public Badge(w0a w0aVar) {
        throw null;
    }
}
