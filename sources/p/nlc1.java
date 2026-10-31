package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nlc1 implements aik1 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final glc1 f;

    public nlc1(int i, int i2, int i3, boolean z, boolean z2, glc1 glc1Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = glc1Var;
    }

    @Override // p.aik1
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlc1)) {
            return false;
        }
        nlc1 nlc1Var = (nlc1) obj;
        return this.a == nlc1Var.a && this.b == nlc1Var.b && this.c == nlc1Var.c && this.d == nlc1Var.d && this.e == nlc1Var.e && u890.j(this.f, nlc1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e);
    }
}
