package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e1w {
    public final String a;
    public final String b;
    public final String c;
    public final j4b1 d;
    public final String e;

    public /* synthetic */ e1w(String str, String str2, j4b1 j4b1Var, String str3, int i) {
        this(str, "", (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : j4b1Var, (i & 16) != 0 ? null : str3);
    }

    public static e1w a(e1w e1wVar, String str) {
        String str2 = e1wVar.a;
        String str3 = e1wVar.c;
        j4b1 j4b1Var = e1wVar.d;
        String str4 = e1wVar.e;
        e1wVar.getClass();
        return new e1w(str2, str, str3, j4b1Var, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1w)) {
            return false;
        }
        e1w e1wVar = (e1w) obj;
        return u890.j(this.a, e1wVar.a) && u890.j(this.b, e1wVar.b) && u890.j(this.c, e1wVar.c) && this.d == e1wVar.d && u890.j(this.e, e1wVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        j4b1 j4b1Var = this.d;
        int iHashCode2 = (iHashCode + (j4b1Var == null ? 0 : j4b1Var.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public e1w(String str, String str2, String str3, j4b1 j4b1Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j4b1Var;
        this.e = str4;
    }
}
