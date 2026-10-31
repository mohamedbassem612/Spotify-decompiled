package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nkk {
    public final kkk a;
    public final List b;
    public final lkk c;
    public final olo0 d;
    public final tt6 e;

    public nkk(kkk kkkVar, List list, lkk lkkVar, olo0 olo0Var, tt6 tt6Var) {
        this.a = kkkVar;
        this.b = list;
        this.c = lkkVar;
        this.d = olo0Var;
        this.e = tt6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkk)) {
            return false;
        }
        nkk nkkVar = (nkk) obj;
        return this.a.equals(nkkVar.a) && u890.j(this.b, nkkVar.b) && u890.j(this.c, nkkVar.c) && u890.j(this.d, nkkVar.d) && u890.j(this.e, nkkVar.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.a.hashCode() * 31, 31, this.b);
        lkk lkkVar = this.c;
        int iHashCode = (iB + (lkkVar == null ? 0 : lkkVar.a.hashCode())) * 31;
        olo0 olo0Var = this.d;
        int iHashCode2 = (iHashCode + (olo0Var == null ? 0 : olo0Var.hashCode())) * 31;
        tt6 tt6Var = this.e;
        return iHashCode2 + (tt6Var != null ? tt6Var.hashCode() : 0);
    }
}
