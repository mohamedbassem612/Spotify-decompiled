package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v0p0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public v0p0(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i2 - i;
    }

    public final float a(int i) {
        int i2 = this.d;
        if (i2 > 0) {
            return yoi1.o((i - this.b) / i2, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0p0)) {
            return false;
        }
        v0p0 v0p0Var = (v0p0) obj;
        return this.a == v0p0Var.a && this.b == v0p0Var.b && this.c == v0p0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
