package p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dq10 {
    public final ArrayList a;
    public final x4e0 b;
    public final yz21 c;
    public final String d;
    public final String e;
    public final String f;
    public final Set g;
    public final ioj0 h;

    public dq10(ArrayList arrayList, x4e0 x4e0Var, yz21 yz21Var, String str, String str2, String str3, Set set, ioj0 ioj0Var) {
        this.a = arrayList;
        this.b = x4e0Var;
        this.c = yz21Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = set;
        this.h = ioj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq10)) {
            return false;
        }
        dq10 dq10Var = (dq10) obj;
        return this.a.equals(dq10Var.a) && this.b == dq10Var.b && this.c.equals(dq10Var.c) && this.d.equals(dq10Var.d) && u890.j(this.e, dq10Var.e) && this.f.equals(dq10Var.f) && u890.j(this.g, dq10Var.g) && u890.j(this.h, dq10Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(bb00.g(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
        String str = this.e;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        Set set = this.g;
        int iHashCode = (iD2 + (set == null ? 0 : set.hashCode())) * 31;
        ioj0 ioj0Var = this.h;
        return iHashCode + (ioj0Var != null ? ioj0Var.a.hashCode() : 0);
    }
}
