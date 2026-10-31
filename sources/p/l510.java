package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l510 {
    public final List a;
    public final m510 b;
    public final String c;

    public l510(List list, m510 m510Var, String str) {
        this.a = list;
        this.b = m510Var;
        this.c = str;
    }

    public static l510 a(l510 l510Var, ArrayList arrayList) {
        return new l510(arrayList, l510Var.b, l510Var.c);
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l510)) {
            return false;
        }
        l510 l510Var = (l510) obj;
        return u890.j(this.a, l510Var.a) && this.b == l510Var.b && u890.j(this.c, l510Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m510 m510Var = this.b;
        int iHashCode2 = (iHashCode + (m510Var == null ? 0 : m510Var.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
