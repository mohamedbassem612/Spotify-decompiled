package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class shc0 {
    public static final shc0 d;
    public final float a;
    public final int b;
    public final int c;

    static {
        float f = phc0.b;
        d = new shc0(17, 0, luo1.r());
    }

    public shc0(int i, int i2, float f) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shc0)) {
            return false;
        }
        shc0 shc0Var = (shc0) obj;
        float f = shc0Var.a;
        float f2 = phc0.b;
        return Float.compare(this.a, f) == 0 && rhc0.b(this.b, shc0Var.b) && qhc0.b(this.c, shc0Var.c);
    }

    public final int hashCode() {
        float f = phc0.b;
        return qhc0.c(this.c) + ((rhc0.c(this.b) + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return l1d.n(qhc0.d(this.c), ")", gvg.n("LineHeightStyle(alignment=", phc0.b(this.a), ", trim=", rhc0.d(this.b), ",mode="));
    }
}
