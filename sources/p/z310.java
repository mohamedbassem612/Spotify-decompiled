package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z310 {
    public final List a;
    public final f410 b;
    public final m510 c;
    public final String d;

    public z310(List list, f410 f410Var, m510 m510Var, String str) {
        this.a = list;
        this.b = f410Var;
        this.c = m510Var;
        this.d = str;
    }

    public static z310 a(z310 z310Var, List list, f410 f410Var, int i) {
        if ((i & 1) != 0) {
            list = z310Var.a;
        }
        if ((i & 2) != 0) {
            f410Var = z310Var.b;
        }
        m510 m510Var = z310Var.c;
        String str = z310Var.d;
        z310Var.getClass();
        return new z310(list, f410Var, m510Var, str);
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z310)) {
            return false;
        }
        z310 z310Var = (z310) obj;
        return u890.j(this.a, z310Var.a) && u890.j(this.b, z310Var.b) && this.c == z310Var.c && u890.j(this.d, z310Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        f410 f410Var = this.b;
        int iHashCode2 = (iHashCode + (f410Var == null ? 0 : f410Var.hashCode())) * 31;
        m510 m510Var = this.c;
        int iHashCode3 = (iHashCode2 + (m510Var == null ? 0 : m510Var.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public z310(List list) {
        this(list, null, null, null);
    }

    public z310(ArrayList arrayList, f410 f410Var) {
        this(arrayList, f410Var, null, null);
    }
}
