package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sb1 extends d5p1 {
    public final c380 c;
    public final c380 d;
    public final boolean e;
    public final mlr0 f;
    public final boolean g;
    public final int h;
    public final u380 i;

    public sb1(c380 c380Var, c380 c380Var2, boolean z, mlr0 mlr0Var, boolean z2, int i, u380 u380Var) {
        this.c = c380Var;
        this.d = c380Var2;
        this.e = z;
        this.f = mlr0Var;
        this.g = z2;
        this.h = i;
        this.i = u380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb1)) {
            return false;
        }
        sb1 sb1Var = (sb1) obj;
        return u890.j(this.c, sb1Var.c) && u890.j(this.d, sb1Var.d) && this.e == sb1Var.e && u890.j(this.f, sb1Var.f) && this.g == sb1Var.g && this.h == sb1Var.h && u890.j(this.i, sb1Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + kaa0.f(this.h, xcg1.g((this.f.hashCode() + xcg1.g(kk0.f(this.d, this.c.hashCode() * 31, 31), 31, this.e)) * 31, 31, this.g), 31);
    }
}
