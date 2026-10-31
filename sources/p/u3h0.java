package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u3h0 implements e4h0 {
    public final String a;
    public final tv80 b;

    public u3h0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3h0)) {
            return false;
        }
        u3h0 u3h0Var = (u3h0) obj;
        return u890.j(this.a, u3h0Var.a) && u890.j(this.b, u3h0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
