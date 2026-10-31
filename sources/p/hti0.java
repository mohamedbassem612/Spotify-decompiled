package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hti0 {
    public final String a;
    public final lik1 b;
    public final String c;
    public final qxc0 d;
    public final gn10 e;
    public final dpu0 f;

    public hti0(String str, lik1 lik1Var, String str2, qxc0 qxc0Var, gn10 gn10Var, dpu0 dpu0Var) {
        this.a = str;
        this.b = lik1Var;
        this.c = str2;
        this.d = qxc0Var;
        this.e = gn10Var;
        this.f = dpu0Var;
        u890.j(lik1Var.a, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hti0)) {
            return false;
        }
        hti0 hti0Var = (hti0) obj;
        return this.a.equals(hti0Var.a) && u890.j(this.b, hti0Var.b) && this.c.equals(hti0Var.c) && u890.j(this.d, hti0Var.d) && u890.j(this.e, hti0Var.e) && u890.j(this.f, hti0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        qxc0 qxc0Var = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iD + (qxc0Var == null ? 0 : qxc0Var.hashCode())) * 31)) * 31);
    }
}
