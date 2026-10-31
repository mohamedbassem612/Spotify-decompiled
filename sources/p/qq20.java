package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qq20 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public qq20(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq20)) {
            return false;
        }
        qq20 qq20Var = (qq20) obj;
        return Float.compare(this.a, qq20Var.a) == 0 && Float.compare(this.b, qq20Var.b) == 0 && Float.compare(this.c, qq20Var.c) == 0 && Float.compare(this.d, qq20Var.d) == 0 && Float.compare(this.e, qq20Var.e) == 0 && Float.compare(this.f, qq20Var.f) == 0 && Float.compare(this.g, qq20Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
