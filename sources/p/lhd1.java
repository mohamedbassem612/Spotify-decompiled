package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lhd1 {
    public final float a;
    public final float b;

    public lhd1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhd1)) {
            return false;
        }
        lhd1 lhd1Var = (lhd1) obj;
        return p3v.c(this.a, lhd1Var.a) && p3v.c(this.b, lhd1Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        float f = this.a;
        String strD = p3v.d(f);
        float f2 = this.b;
        return l1d.n(p3v.d(f2), ")", gvg.n("TabPosition(left=", strD, ", right=", p3v.d(f + f2), ", width="));
    }
}
