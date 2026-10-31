package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rgi1 {
    public final List a;
    public final String b;
    public final jgi1 c;
    public final ngi1 d;
    public final pgx e;

    public rgi1(List list, String str, String str2, ngi1 ngi1Var) {
        this(list, str, str2 != null ? new igi1(str2) : null, ngi1Var, mgx.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgi1)) {
            return false;
        }
        rgi1 rgi1Var = (rgi1) obj;
        return u890.j(this.a, rgi1Var.a) && u890.j(this.b, rgi1Var.b) && u890.j(this.c, rgi1Var.c) && u890.j(this.d, rgi1Var.d) && u890.j(this.e, rgi1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        jgi1 jgi1Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iD + (jgi1Var == null ? 0 : jgi1Var.hashCode())) * 31)) * 31);
    }

    public /* synthetic */ rgi1(List list, String str, mgi1 mgi1Var) {
        this(list, str, null, mgi1Var, mgx.e);
    }

    public rgi1(List list, String str, jgi1 jgi1Var, ngi1 ngi1Var, pgx pgxVar) {
        this.a = list;
        this.b = str;
        this.c = jgi1Var;
        this.d = ngi1Var;
        this.e = pgxVar;
    }
}
