package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u2h0 implements e4h0 {
    public final String a;
    public final String b;
    public final tv80 c;

    public u2h0(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2h0)) {
            return false;
        }
        u2h0 u2h0Var = (u2h0) obj;
        return this.a.equals(u2h0Var.a) && this.b.equals(u2h0Var.b) && u890.j(this.c, u2h0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
