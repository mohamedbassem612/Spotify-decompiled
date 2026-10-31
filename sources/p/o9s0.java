package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o9s0 extends t9s0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public o9s0(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9s0)) {
            return false;
        }
        o9s0 o9s0Var = (o9s0) obj;
        return Float.compare(this.c, o9s0Var.c) == 0 && Float.compare(this.d, o9s0Var.d) == 0 && Float.compare(this.e, o9s0Var.e) == 0 && Float.compare(this.f, o9s0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + x0d.f(x0d.f(Float.hashCode(this.c) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbM = gvg.m("RelativeQuadTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        sbM.append(this.e);
        sbM.append(", dy2=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }
}
