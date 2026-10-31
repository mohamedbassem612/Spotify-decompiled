package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uzl extends zzl {
    public final gxs0 a;
    public final boolean b;
    public final tv80 c;

    public uzl(gxs0 gxs0Var, tv80 tv80Var, int i) {
        boolean z = (i & 2) != 0;
        tv80Var = (i & 4) != 0 ? null : tv80Var;
        this.a = gxs0Var;
        this.b = z;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzl)) {
            return false;
        }
        uzl uzlVar = (uzl) obj;
        return u890.j(this.a, uzlVar.a) && this.b == uzlVar.b && u890.j(this.c, uzlVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
