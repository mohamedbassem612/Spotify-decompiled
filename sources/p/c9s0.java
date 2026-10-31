package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c9s0 extends t9s0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public c9s0(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9s0)) {
            return false;
        }
        c9s0 c9s0Var = (c9s0) obj;
        return Float.compare(this.c, c9s0Var.c) == 0 && Float.compare(this.d, c9s0Var.d) == 0 && Float.compare(this.e, c9s0Var.e) == 0 && Float.compare(this.f, c9s0Var.f) == 0 && Float.compare(this.g, c9s0Var.g) == 0 && Float.compare(this.h, c9s0Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.c) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbM = gvg.m("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        gvg.t(sbM, this.e, ", y2=", this.f, ", x3=");
        sbM.append(this.g);
        sbM.append(", y3=");
        sbM.append(this.h);
        sbM.append(")");
        return sbM.toString();
    }
}
