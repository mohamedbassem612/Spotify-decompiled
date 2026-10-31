package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b351 {
    public final ArrayList a;
    public final xo20 b;
    public final String c;
    public final List d;

    public b351(ArrayList arrayList, xo20 xo20Var, String str, List list) {
        this.a = arrayList;
        this.b = xo20Var;
        this.c = str;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b351)) {
            return false;
        }
        b351 b351Var = (b351) obj;
        return this.a.equals(b351Var.a) && u890.j(this.b, b351Var.b) && u890.j(this.c, b351Var.c) && this.d.equals(b351Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xo20 xo20Var = this.b;
        return this.d.hashCode() + cy30.d((iHashCode + (xo20Var == null ? 0 : xo20Var.hashCode())) * 31, 31, this.c);
    }
}
