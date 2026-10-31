package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g7j0 {
    public final cyo1 a;
    public final e7j0 b;
    public final String c;
    public final String d;
    public final String e;

    public g7j0(cyo1 cyo1Var, e7j0 e7j0Var, String str, String str2, String str3) {
        this.a = cyo1Var;
        this.b = e7j0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public static g7j0 a(g7j0 g7j0Var, cyo1 cyo1Var, e7j0 e7j0Var, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            cyo1Var = g7j0Var.a;
        }
        cyo1 cyo1Var2 = cyo1Var;
        if ((i & 2) != 0) {
            e7j0Var = g7j0Var.b;
        }
        e7j0 e7j0Var2 = e7j0Var;
        if ((i & 4) != 0) {
            str = g7j0Var.c;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = g7j0Var.d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = g7j0Var.e;
        }
        return new g7j0(cyo1Var2, e7j0Var2, str4, str5, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7j0)) {
            return false;
        }
        g7j0 g7j0Var = (g7j0) obj;
        return u890.j(this.a, g7j0Var.a) && u890.j(this.b, g7j0Var.b) && u890.j(this.c, g7j0Var.c) && u890.j(this.d, g7j0Var.d) && u890.j(this.e, g7j0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
