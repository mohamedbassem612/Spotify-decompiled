package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lel1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;

    public lel1(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = f10;
        this.k = f11;
    }

    public final boolean a() {
        float f = this.g;
        if (Math.abs(f) > Float.MAX_VALUE || f <= 0.0f) {
            return false;
        }
        float f2 = this.b;
        return Math.abs(f2) <= Float.MAX_VALUE && f2 > 0.0f;
    }

    public final float b(float f) {
        if (!a()) {
            return 0.0f;
        }
        float f2 = (f / this.g) * this.b;
        if (Math.abs(f2) <= Float.MAX_VALUE) {
            return f2;
        }
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lel1)) {
            return false;
        }
        lel1 lel1Var = (lel1) obj;
        return Float.compare(this.a, lel1Var.a) == 0 && Float.compare(this.b, lel1Var.b) == 0 && Float.compare(this.c, lel1Var.c) == 0 && Float.compare(this.d, lel1Var.d) == 0 && Float.compare(this.e, lel1Var.e) == 0 && Float.compare(this.f, lel1Var.f) == 0 && Float.compare(this.g, lel1Var.g) == 0 && Float.compare(this.h, lel1Var.h) == 0 && Float.compare(this.i, lel1Var.i) == 0 && Float.compare(this.j, lel1Var.j) == 0 && Float.compare(this.k, lel1Var.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
