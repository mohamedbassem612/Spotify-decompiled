package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j9s0 extends t9s0 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public j9s0(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9s0)) {
            return false;
        }
        j9s0 j9s0Var = (j9s0) obj;
        return Float.compare(this.c, j9s0Var.c) == 0 && Float.compare(this.d, j9s0Var.d) == 0 && Float.compare(this.e, j9s0Var.e) == 0 && this.f == j9s0Var.f && this.g == j9s0Var.g && Float.compare(this.h, j9s0Var.h) == 0 && Float.compare(this.i, j9s0Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + x0d.f(xcg1.g(xcg1.g(x0d.f(x0d.f(Float.hashCode(this.c) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbM = gvg.m("RelativeArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbM.append(this.e);
        sbM.append(", isMoreThanHalf=");
        sbM.append(this.f);
        sbM.append(", isPositiveArc=");
        sbM.append(this.g);
        sbM.append(", arcStartDx=");
        sbM.append(this.h);
        sbM.append(", arcStartDy=");
        sbM.append(this.i);
        sbM.append(")");
        return sbM.toString();
    }
}
