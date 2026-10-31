package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rkj1 {
    public final yj41 a;
    public final vu30 b;
    public final vu30 c;
    public final did d;
    public final vu30 e;
    public final float f;
    public final float g;

    public rkj1(yj41 yj41Var, vu30 vu30Var, vu30 vu30Var2, did didVar, fb90 fb90Var, float f, float f2) {
        this.a = yj41Var;
        this.b = vu30Var;
        this.c = vu30Var2;
        this.d = didVar;
        this.e = fb90Var;
        this.f = f;
        this.g = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkj1)) {
            return false;
        }
        rkj1 rkj1Var = (rkj1) obj;
        return u890.j(this.a, rkj1Var.a) && this.b.equals(rkj1Var.b) && this.c.equals(rkj1Var.c) && this.d.equals(rkj1Var.d) && u890.j(this.e, rkj1Var.e) && p3v.c(this.f, rkj1Var.f) && p3v.c(this.g, rkj1Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + hrt.g(hrt.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        vu30 vu30Var = this.e;
        return Float.hashCode(this.g) + x0d.f((iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31, 31, this.f);
    }
}
