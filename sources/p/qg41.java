package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qg41 {
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

    public qg41(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg41)) {
            return false;
        }
        qg41 qg41Var = (qg41) obj;
        return p3v.c(this.a, qg41Var.a) && p3v.c(this.b, qg41Var.b) && p3v.c(this.c, qg41Var.c) && p3v.c(this.d, qg41Var.d) && p3v.c(this.e, qg41Var.e) && p3v.c(this.f, qg41Var.f) && p3v.c(this.g, qg41Var.g) && p3v.c(this.h, qg41Var.h) && p3v.c(this.i, qg41Var.i) && p3v.c(this.j, qg41Var.j);
    }

    public final int hashCode() {
        return Float.hashCode(this.j) + x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
