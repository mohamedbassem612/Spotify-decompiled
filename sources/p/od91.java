package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class od91 implements td91 {
    public final List a;
    public final String b;
    public final String c;
    public final x4e0 d;
    public final ioj0 e;

    public od91(List list, String str, String str2, x4e0 x4e0Var, ioj0 ioj0Var) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = x4e0Var;
        this.e = ioj0Var;
    }

    @Override // p.td91
    public final String breadcrumb() {
        return gvg.e(this.a.size(), "Complete(sections=", ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od91)) {
            return false;
        }
        od91 od91Var = (od91) obj;
        return u890.j(this.a, od91Var.a) && u890.j(this.b, od91Var.b) && u890.j(this.c, od91Var.c) && this.d == od91Var.d && u890.j(this.e, od91Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.d.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        ioj0 ioj0Var = this.e;
        return iHashCode2 + (ioj0Var != null ? ioj0Var.a.hashCode() : 0);
    }
}
