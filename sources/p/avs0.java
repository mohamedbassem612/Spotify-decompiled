package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class avs0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public avs0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avs0)) {
            return false;
        }
        avs0 avs0Var = (avs0) obj;
        return Float.compare(this.a, avs0Var.a) == 0 && Float.compare(this.b, avs0Var.b) == 0 && Float.compare(this.c, avs0Var.c) == 0 && Float.compare(this.d, avs0Var.d) == 0 && Float.compare(this.e, avs0Var.e) == 0 && Float.compare(this.f, avs0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
