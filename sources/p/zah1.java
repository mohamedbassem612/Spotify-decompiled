package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zah1 {
    public final String a;
    public final boolean b;
    public final List c;
    public final hbh1 d;

    public zah1(String str, boolean z, List list, hbh1 hbh1Var) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = hbh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zah1)) {
            return false;
        }
        zah1 zah1Var = (zah1) obj;
        return u890.j(this.a, zah1Var.a) && this.b == zah1Var.b && u890.j(this.c, zah1Var.c) && u890.j(this.d, zah1Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        hbh1 hbh1Var = this.d;
        return iB + (hbh1Var == null ? 0 : hbh1Var.hashCode());
    }
}
