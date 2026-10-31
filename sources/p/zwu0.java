package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zwu0 {
    public final String a;
    public final String b;
    public final List c;
    public final Set d;
    public final Set e;
    public final String f;
    public final Boolean g;
    public final String h;
    public final String i;
    public final tv80 j;
    public final String k;
    public final boolean l;

    public zwu0(String str, String str2, List list, Set set, Set set2, String str3, Boolean bool, String str4, String str5, tv80 tv80Var, String str6, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = set;
        this.e = set2;
        this.f = str3;
        this.g = bool;
        this.h = str4;
        this.i = str5;
        this.j = tv80Var;
        this.k = str6;
        this.l = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwu0)) {
            return false;
        }
        zwu0 zwu0Var = (zwu0) obj;
        return u890.j(this.a, zwu0Var.a) && this.b.equals(zwu0Var.b) && this.c.equals(zwu0Var.c) && u890.j(this.d, zwu0Var.d) && u890.j(this.e, zwu0Var.e) && u890.j(this.f, zwu0Var.f) && u890.j(this.g, zwu0Var.g) && u890.j(this.h, zwu0Var.h) && this.i.equals(zwu0Var.i) && u890.j(this.j, zwu0Var.j) && this.k.equals(zwu0Var.k) && this.l == zwu0Var.l;
    }

    public final int hashCode() {
        int iC = gvg.c(gvg.c(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.h;
        int iD = cy30.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        tv80 tv80Var = this.j;
        return Boolean.hashCode(this.l) + cy30.d((iD + (tv80Var != null ? tv80Var.hashCode() : 0)) * 31, 31, this.k);
    }
}
