package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tzg0 implements k0h0 {
    public final String a;
    public final boolean b;
    public final tv80 c;

    public tzg0(String str, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = z;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzg0)) {
            return false;
        }
        tzg0 tzg0Var = (tzg0) obj;
        return u890.j(this.a, tzg0Var.a) && this.b == tzg0Var.b && u890.j(this.c, tzg0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
