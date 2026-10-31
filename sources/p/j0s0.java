package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j0s0 {
    public final short a;
    public final short b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    /* JADX WARN: Multi-variable type inference failed */
    public j0s0(int i, int i2, float f, float f2, float f3, float f4, float f5) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0s0)) {
            return false;
        }
        j0s0 j0s0Var = (j0s0) obj;
        return this.a == j0s0Var.a && this.b == j0s0Var.b && Float.compare(this.c, j0s0Var.c) == 0 && Float.compare(this.d, j0s0Var.d) == 0 && Float.compare(this.e, j0s0Var.e) == 0 && Float.compare(this.f, j0s0Var.f) == 0 && Float.compare(this.g, j0s0Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + x0d.f(x0d.f(x0d.f(x0d.f(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
