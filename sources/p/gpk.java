package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gpk {
    public final uy30 a;
    public final List b;
    public final ymd0 c;
    public final String d;

    public gpk(uy30 uy30Var, List list, ymd0 ymd0Var, String str) {
        this.a = uy30Var;
        this.b = list;
        this.c = ymd0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpk)) {
            return false;
        }
        gpk gpkVar = (gpk) obj;
        return u890.j(this.a, gpkVar.a) && u890.j(this.b, gpkVar.b) && u890.j(this.c, gpkVar.c) && u890.j(this.d, gpkVar.d);
    }

    public final int hashCode() {
        uy30 uy30Var = this.a;
        int iHashCode = (this.c.hashCode() + f4i1.b((uy30Var == null ? 0 : uy30Var.hashCode()) * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
