package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vun0 implements xun0 {
    public final zf30 a;
    public final xg30 b;

    public vun0(zf30 zf30Var, xg30 xg30Var) {
        this.a = zf30Var;
        this.b = xg30Var;
    }

    @Override // p.xun0
    public final xg30 a() {
        return this.b;
    }

    @Override // p.xun0
    public final zf30 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vun0)) {
            return false;
        }
        vun0 vun0Var = (vun0) obj;
        return u890.j(this.a, vun0Var.a) && u890.j(this.b, vun0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
