package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class he5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public he5(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he5)) {
            return false;
        }
        he5 he5Var = (he5) obj;
        return Float.compare(this.a, he5Var.a) == 0 && Float.compare(this.b, he5Var.b) == 0 && Float.compare(this.c, he5Var.c) == 0 && Float.compare(this.d, he5Var.d) == 0 && Float.compare(this.e, he5Var.e) == 0 && Float.compare(this.f, he5Var.f) == 0 && Float.compare(this.g, he5Var.g) == 0 && Float.compare(this.h, he5Var.h) == 0 && Float.compare(this.i, he5Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
