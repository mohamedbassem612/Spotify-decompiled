package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jqk1 {
    public final List a;
    public final gfu0 b;
    public final long c;
    public final boolean d;

    public jqk1(List list, gfu0 gfu0Var, long j, boolean z) {
        this.a = list;
        this.b = gfu0Var;
        this.c = j;
        this.d = z;
    }

    public static jqk1 a(jqk1 jqk1Var, ArrayList arrayList, gfu0 gfu0Var, long j, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = jqk1Var.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            gfu0Var = jqk1Var.b;
        }
        gfu0 gfu0Var2 = gfu0Var;
        if ((i & 4) != 0) {
            j = jqk1Var.c;
        }
        return new jqk1(list2, gfu0Var2, j, (i & 8) != 0 ? jqk1Var.d : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqk1)) {
            return false;
        }
        jqk1 jqk1Var = (jqk1) obj;
        return u890.j(this.a, jqk1Var.a) && u890.j(this.b, jqk1Var.b) && this.c == jqk1Var.c && this.d == jqk1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gfu0 gfu0Var = this.b;
        return Boolean.hashCode(this.d) + cy30.f((iHashCode + (gfu0Var == null ? 0 : gfu0Var.hashCode())) * 31, this.c, 31);
    }

    public /* synthetic */ jqk1(List list) {
        this(list, null, 1L, false);
    }
}
