package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o3k0 implements k4k0 {
    public final int a;
    public final int b;
    public final tv80 c;

    public o3k0(int i, int i2, tv80 tv80Var) {
        this.a = i;
        this.b = i2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3k0)) {
            return false;
        }
        o3k0 o3k0Var = (o3k0) obj;
        return this.a == o3k0Var.a && this.b == o3k0Var.b && u890.j(this.c, o3k0Var.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, l1d.C(this.a) * 31, 31);
        tv80 tv80Var = this.c;
        return iK + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
