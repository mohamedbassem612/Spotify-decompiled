package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pmg1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public pmg1(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f4 * f2;
        float f7 = (f - f2) / 2.0f;
        f7 = f7 < 0.0f ? 0.0f : f7;
        this.h = f7;
        this.i = f7 - f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmg1)) {
            return false;
        }
        pmg1 pmg1Var = (pmg1) obj;
        return Float.compare(this.a, pmg1Var.a) == 0 && Float.compare(this.b, pmg1Var.b) == 0 && Float.compare(this.c, pmg1Var.c) == 0 && Float.compare(this.d, pmg1Var.d) == 0 && Float.compare(this.e, pmg1Var.e) == 0 && Float.compare(this.f, pmg1Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
