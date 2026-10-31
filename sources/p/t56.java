package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t56 {
    public final String a;
    public final String b;
    public final String c;
    public final xw51 d;
    public final mvh1 e;
    public final Set f;
    public final String g;
    public final nmu0 h;

    public t56(String str, String str2, String str3, xw51 xw51Var, mvh1 mvh1Var, Set set, String str4, nmu0 nmu0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xw51Var;
        this.e = mvh1Var;
        this.f = set;
        this.g = str4;
        this.h = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t56)) {
            return false;
        }
        t56 t56Var = (t56) obj;
        return u890.j(this.a, t56Var.a) && u890.j(this.b, t56Var.b) && u890.j(this.c, t56Var.c) && u890.j(this.d, t56Var.d) && u890.j(this.e, t56Var.e) && u890.j(this.f, t56Var.f) && u890.j(this.g, t56Var.g) && this.h == t56Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        xw51 xw51Var = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (xw51Var == null ? 0 : xw51Var.hashCode())) * 31)) * 31;
        Set set = this.f;
        int iHashCode5 = (iHashCode4 + (set == null ? 0 : set.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        nmu0 nmu0Var = this.h;
        return iHashCode6 + (nmu0Var != null ? nmu0Var.hashCode() : 0);
    }

    public /* synthetic */ t56(String str, String str2, String str3, xw51 xw51Var, mvh1 mvh1Var, Set set, String str4) {
        this(str, str2, str3, xw51Var, mvh1Var, set, str4, null);
    }
}
