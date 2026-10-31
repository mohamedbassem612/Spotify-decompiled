package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d8y0 {
    public final String a;
    public final String b;
    public final int c;
    public final cio d;
    public final Map e;

    public d8y0(String str, String str2, int i, cio cioVar, Map map) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = cioVar;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8y0)) {
            return false;
        }
        d8y0 d8y0Var = (d8y0) obj;
        return u890.j(this.a, d8y0Var.a) && u890.j(this.b, d8y0Var.b) && this.c == d8y0Var.c && u890.j(this.d, d8y0Var.d) && u890.j(this.e, d8y0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iK = ab80.k(this.c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        cio cioVar = this.d;
        return this.e.hashCode() + ((iK + (cioVar != null ? cioVar.hashCode() : 0)) * 31);
    }
}
