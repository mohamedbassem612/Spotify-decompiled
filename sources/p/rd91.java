package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rd91 implements td91 {
    public final List a;
    public final String b;
    public final String c;
    public final x4e0 d;
    public final ioj0 e;

    public rd91(List list, String str, String str2, x4e0 x4e0Var, ioj0 ioj0Var) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = x4e0Var;
        this.e = ioj0Var;
    }

    public final String breadcrumb() {
        return gvg.e(this.a.size(), "Loaded(sections=", ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd91)) {
            return false;
        }
        rd91 rd91Var = (rd91) obj;
        return u890.j(this.a, rd91Var.a) && u890.j(this.b, rd91Var.b) && u890.j(this.c, rd91Var.c) && this.d == rd91Var.d && u890.j(this.e, rd91Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.d.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        ioj0 ioj0Var = this.e;
        return iHashCode2 + (ioj0Var != null ? ioj0Var.a.hashCode() : 0);
    }
}
