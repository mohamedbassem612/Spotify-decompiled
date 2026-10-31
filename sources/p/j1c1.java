package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j1c1 {
    public final uqo a;
    public final List b;
    public final String c;
    public final lax d;
    public final String e;

    public j1c1(uqo uqoVar, List list, String str, lax laxVar, String str2) {
        this.a = uqoVar;
        this.b = list;
        this.c = str;
        this.d = laxVar;
        this.e = str2;
    }

    public static j1c1 a(j1c1 j1c1Var, List list, String str, lax laxVar, String str2, int i) {
        List list2 = list;
        uqo uqoVar = j1c1Var.a;
        if ((i & 2) != 0) {
            list2 = j1c1Var.b;
        }
        if ((i & 4) != 0) {
            str = j1c1Var.c;
        }
        if ((i & 8) != 0) {
            laxVar = j1c1Var.d;
        }
        if ((i & 16) != 0) {
            str2 = j1c1Var.e;
        }
        String str3 = str2;
        j1c1Var.getClass();
        lax laxVar2 = laxVar;
        return new j1c1(uqoVar, list2, str, laxVar2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1c1)) {
            return false;
        }
        j1c1 j1c1Var = (j1c1) obj;
        return this.a.equals(j1c1Var.a) && u890.j(this.b, j1c1Var.b) && u890.j(this.c, j1c1Var.c) && u890.j(this.d, j1c1Var.d) && u890.j(this.e, j1c1Var.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
