package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x9b1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public x9b1(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9b1)) {
            return false;
        }
        x9b1 x9b1Var = (x9b1) obj;
        return Float.compare(this.a, x9b1Var.a) == 0 && Float.compare(this.b, x9b1Var.b) == 0 && Float.compare(this.c, x9b1Var.c) == 0 && Float.compare(this.d, x9b1Var.d) == 0 && this.e == x9b1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
