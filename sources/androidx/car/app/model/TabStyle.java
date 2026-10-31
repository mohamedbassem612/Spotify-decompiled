package androidx.car.app.model;

import java.util.Objects;
import p.qrd;
import p.ujd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class TabStyle {
    private final CarColor mSelectedBackgroundColor;
    private final Shape mShape;
    private final CarColor mTextColor;

    private TabStyle(ujd1 ujd1Var) {
        this.mShape = ujd1Var.a;
        this.mSelectedBackgroundColor = ujd1Var.b;
        this.mTextColor = ujd1Var.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabStyle)) {
            return false;
        }
        TabStyle tabStyle = (TabStyle) obj;
        return Objects.equals(this.mShape, tabStyle.mShape) && Objects.equals(this.mSelectedBackgroundColor, tabStyle.mSelectedBackgroundColor) && Objects.equals(this.mTextColor, tabStyle.mTextColor);
    }

    public CarColor getSelectedBackgroundColor() {
        return this.mSelectedBackgroundColor;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public CarColor getTextColor() {
        return this.mTextColor;
    }

    public int hashCode() {
        return Objects.hash(this.mShape, this.mSelectedBackgroundColor, this.mTextColor);
    }

    public String toString() {
        return "TabStyle { shape: " + this.mShape + ", selectedBackgroundColor: " + this.mSelectedBackgroundColor + ", textColor: " + this.mTextColor + " }";
    }

    public /* synthetic */ TabStyle(ujd1 ujd1Var, int i) {
        this(ujd1Var);
    }

    private TabStyle() {
        this.mShape = null;
        this.mSelectedBackgroundColor = null;
        this.mTextColor = null;
    }
}
