package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a2c1 extends c2c1 {
    public final int a;
    public final int b;
    public final Throwable c;

    public a2c1(int i, int i2, Throwable th) {
        this.a = i;
        this.b = i2;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2c1)) {
            return false;
        }
        a2c1 a2c1Var = (a2c1) obj;
        return this.a == a2c1Var.a && this.b == a2c1Var.b && u890.j(this.c, a2c1Var.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, l1d.C(this.a) * 31, 31);
        Throwable th = this.c;
        return iK + (th == null ? 0 : th.hashCode());
    }
}
