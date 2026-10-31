package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rzb1 {
    public final float a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public rzb1(int i, int i2, float f) {
        this.a = f;
        this.b = i;
        this.c = i2;
        i = i <= 0 ? i2 : i;
        this.d = i;
        this.e = i - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzb1)) {
            return false;
        }
        rzb1 rzb1Var = (rzb1) obj;
        return Float.compare(this.a, rzb1Var.a) == 0 && this.b == rzb1Var.b && this.c == rzb1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Float.hashCode(this.a) * 31, 31);
    }
}
