package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l2e {
    public final List a;
    public final ioj0 b;
    public final yz21 c;
    public final String d;
    public final x4e0 e;
    public final Set f;
    public final String g;
    public final String h;

    public l2e(List list, ioj0 ioj0Var, yz21 yz21Var, String str, x4e0 x4e0Var, Set set, String str2, String str3) {
        this.a = list;
        this.b = ioj0Var;
        this.c = yz21Var;
        this.d = str;
        this.e = x4e0Var;
        this.f = set;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2e)) {
            return false;
        }
        l2e l2eVar = (l2e) obj;
        return this.a.equals(l2eVar.a) && u890.j(this.b, l2eVar.b) && this.c.equals(l2eVar.c) && u890.j(this.d, l2eVar.d) && this.e == l2eVar.e && u890.j(this.f, l2eVar.f) && this.g.equals(l2eVar.g) && u890.j(this.h, l2eVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ioj0 ioj0Var = this.b;
        int iHashCode2 = (this.e.hashCode() + cy30.d(bb00.g(this.c, (iHashCode + (ioj0Var == null ? 0 : ioj0Var.a.hashCode())) * 31, 31), 31, this.d)) * 31;
        Set set = this.f;
        int iD = cy30.d((iHashCode2 + (set == null ? 0 : set.hashCode())) * 31, 31, this.g);
        String str = this.h;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
