package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cj40 {
    public final bbf1 a;
    public final cbf1 b;
    public final vu30 c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f;
    public final String g;
    public final String h;

    public cj40(bbf1 bbf1Var, cbf1 cbf1Var, dbf1 dbf1Var, ArrayList arrayList, ArrayList arrayList2, String str, String str2, String str3) {
        this.a = bbf1Var;
        this.b = cbf1Var;
        this.c = dbf1Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cj40) {
            cj40 cj40Var = (cj40) obj;
            if (this.a == cj40Var.a && this.b == cj40Var.b && u890.j(this.c, cj40Var.c) && this.d.equals(cj40Var.d) && this.e.equals(cj40Var.e) && this.f.equals(cj40Var.f) && this.g.equals(cj40Var.g) && u890.j(this.h, cj40Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vu30 vu30Var = this.c;
        int iD = cy30.d(cy30.d(p3d1.f(this.e, p3d1.f(this.d, (iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31, 31), 31), 31, this.f), 31, this.g);
        String str = this.h;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
