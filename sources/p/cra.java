package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cra implements nl3 {
    public final float a;

    public cra(float f) {
        this.a = f;
    }

    @Override // p.nl3
    public final int a(int i, int i2, flb0 flb0Var) {
        return c13.e(1.0f, this.a, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cra) && Float.compare(this.a, ((cra) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("Horizontal(bias=", this.a, ")");
    }
}
