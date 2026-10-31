package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j641 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final Long e;
    public final List f;
    public final String g;
    public final jfv h;
    public final qtt0 i;

    public j641(String str, String str2, String str3, int i, Long l, List list, String str4, jfv jfvVar, qtt0 qtt0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = l;
        this.f = list;
        this.g = str4;
        this.h = jfvVar;
        this.i = qtt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j641)) {
            return false;
        }
        j641 j641Var = (j641) obj;
        return this.a.equals(j641Var.a) && this.b.equals(j641Var.b) && this.c.equals(j641Var.c) && this.d == j641Var.d && u890.j(this.e, j641Var.e) && this.f.equals(j641Var.f) && u890.j(this.g, j641Var.g) && u890.j(this.h, j641Var.h) && this.i == j641Var.i;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = this.d;
        int iC = (iD + (i == 0 ? 0 : l1d.C(i))) * 31;
        Long l = this.e;
        int iB = f4i1.b((iC + (l == null ? 0 : l.hashCode())) * 31, 31, this.f);
        String str = this.g;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        jfv jfvVar = this.h;
        return this.i.hashCode() + ((iHashCode + (jfvVar != null ? Long.hashCode(jfvVar.a) : 0)) * 31);
    }
}
