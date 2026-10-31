package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xrg {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public xrg(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
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
        if (!(obj instanceof xrg)) {
            return false;
        }
        xrg xrgVar = (xrg) obj;
        return p3v.c(this.a, xrgVar.a) && Float.compare(this.b, xrgVar.b) == 0 && Float.compare(this.c, xrgVar.c) == 0 && Float.compare(this.d, xrgVar.d) == 0 && Float.compare(this.e, xrgVar.e) == 0 && p3v.c(this.f, xrgVar.f) && p3v.c(this.g, xrgVar.g);
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
