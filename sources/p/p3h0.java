package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p3h0 implements e4h0 {
    public final String a;
    public final tv80 b;

    public p3h0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3h0)) {
            return false;
        }
        p3h0 p3h0Var = (p3h0) obj;
        return u890.j(this.a, p3h0Var.a) && u890.j(this.b, p3h0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
