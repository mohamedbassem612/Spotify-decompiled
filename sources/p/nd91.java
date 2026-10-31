package p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nd91 {
    public final ArrayList a;
    public final x4e0 b;
    public final yz21 c;
    public final String d;
    public final String e;
    public final String f;
    public final Set g;
    public final ioj0 h;

    public nd91(ArrayList arrayList, x4e0 x4e0Var, yz21 yz21Var, String str, String str2, String str3, Set set, ioj0 ioj0Var) {
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
        if (!(obj instanceof nd91)) {
            return false;
        }
        nd91 nd91Var = (nd91) obj;
        return u890.j(this.a, nd91Var.a) && this.b == nd91Var.b && u890.j(this.c, nd91Var.c) && u890.j(this.d, nd91Var.d) && u890.j(this.e, nd91Var.e) && u890.j(this.f, nd91Var.f) && u890.j(this.g, nd91Var.g) && u890.j(this.h, nd91Var.h);
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

    public nd91(ArrayList arrayList, x4e0 x4e0Var, yz21 yz21Var, String str, ioj0 ioj0Var) {
        this(arrayList, x4e0Var, yz21Var, str, null, "", null, ioj0Var);
    }
}
