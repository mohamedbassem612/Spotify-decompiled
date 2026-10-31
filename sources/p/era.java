package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class era implements nl3 {
    public final float a;

    public era(float f) {
        this.a = f;
    }

    @Override // p.nl3
    public final int a(int i, int i2, flb0 flb0Var) {
        float f = (i2 - i) / 2.0f;
        flb0 flb0Var2 = flb0.a;
        float f2 = this.a;
        if (flb0Var != flb0Var2) {
            f2 *= -1.0f;
        }
        return c13.e(1.0f, f2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof era) && Float.compare(this.a, ((era) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("Horizontal(bias=", this.a, ")");
    }
}
