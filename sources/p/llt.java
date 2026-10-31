package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class llt {
    public final String a;
    public final String b;
    public final String c;
    public final u7h d;
    public final zob1 e;
    public final plt f;
    public final ArrayList g;

    public llt(String str, String str2, String str3, u7h u7hVar, zob1 zob1Var, plt pltVar, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u7hVar;
        this.e = zob1Var;
        this.f = pltVar;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof llt) {
            llt lltVar = (llt) obj;
            if (this.a.equals(lltVar.a) && u890.j(this.b, lltVar.b) && u890.j(this.c, lltVar.c) && u890.j(this.d, lltVar.d) && u890.j(this.e, lltVar.e) && this.f == lltVar.f && this.g.equals(lltVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        u7h u7hVar = this.d;
        return this.g.hashCode() + xcg1.g((this.f.hashCode() + ((this.e.hashCode() + ((iD + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31)) * 31)) * 31, 31, false);
    }
}
