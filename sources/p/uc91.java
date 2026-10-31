package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uc91 {
    public final ArrayList a;
    public final boolean b;
    public final yz21 c;
    public final String d;
    public final String e;
    public final x4e0 f;
    public final ioj0 g;

    public uc91(ArrayList arrayList, boolean z, yz21 yz21Var, String str, String str2, x4e0 x4e0Var, ioj0 ioj0Var) {
        this.a = arrayList;
        this.b = z;
        this.c = yz21Var;
        this.d = str;
        this.e = str2;
        this.f = x4e0Var;
        this.g = ioj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc91)) {
            return false;
        }
        uc91 uc91Var = (uc91) obj;
        return this.a.equals(uc91Var.a) && this.b == uc91Var.b && this.c.equals(uc91Var.c) && u890.j(this.d, uc91Var.d) && u890.j(this.e, uc91Var.e) && this.f == uc91Var.f && u890.j(this.g, uc91Var.g);
    }

    public final int hashCode() {
        int iG = bb00.g(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iD = cy30.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        x4e0 x4e0Var = this.f;
        int iHashCode = (iD + (x4e0Var == null ? 0 : x4e0Var.hashCode())) * 31;
        ioj0 ioj0Var = this.g;
        return iHashCode + (ioj0Var != null ? ioj0Var.a.hashCode() : 0);
    }
}
