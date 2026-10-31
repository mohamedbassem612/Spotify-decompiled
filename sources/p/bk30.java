package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bk30 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;

    public bk30(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk30)) {
            return false;
        }
        bk30 bk30Var = (bk30) obj;
        return Float.compare(this.a, bk30Var.a) == 0 && Float.compare(this.b, bk30Var.b) == 0 && Float.compare(this.c, bk30Var.c) == 0 && Float.compare(this.d, bk30Var.d) == 0 && Float.compare(this.e, bk30Var.e) == 0 && Float.compare(this.f, bk30Var.f) == 0 && Float.compare(this.g, bk30Var.g) == 0 && Float.compare(this.h, bk30Var.h) == 0 && this.i == bk30Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
