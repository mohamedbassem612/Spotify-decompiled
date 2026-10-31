package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nmy {
    public final b2a a;
    public final List b;
    public final oqt0 c;
    public final boolean d;

    public nmy(b2a b2aVar, List list, oqt0 oqt0Var, boolean z) {
        this.a = b2aVar;
        this.b = list;
        this.c = oqt0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmy)) {
            return false;
        }
        nmy nmyVar = (nmy) obj;
        return u890.j(this.a, nmyVar.a) && u890.j(this.b, nmyVar.b) && u890.j(this.c, nmyVar.c) && this.d == nmyVar.d;
    }

    public final int hashCode() {
        b2a b2aVar = this.a;
        int iHashCode = (b2aVar == null ? 0 : b2aVar.a.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        oqt0 oqt0Var = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (oqt0Var != null ? oqt0Var.hashCode() : 0)) * 31);
    }
}
