package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fol1 {
    public final float a;
    public final float b;

    public fol1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fol1)) {
            return false;
        }
        fol1 fol1Var = (fol1) obj;
        return Float.compare(this.a, fol1Var.a) == 0 && Float.compare(this.b, fol1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.a + ", y=" + this.b + ")";
    }
}
