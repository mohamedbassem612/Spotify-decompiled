package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gwn0 {
    public final String a;
    public final String b;
    public final String c;
    public final u8h1 d;

    public /* synthetic */ gwn0(String str, String str2, String str3, u8h1 u8h1Var, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : u8h1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwn0)) {
            return false;
        }
        gwn0 gwn0Var = (gwn0) obj;
        return u890.j(this.a, gwn0Var.a) && u890.j(this.b, gwn0Var.b) && u890.j(this.c, gwn0Var.c) && u890.j(this.d, gwn0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        u8h1 u8h1Var = this.d;
        return iHashCode3 + (u8h1Var != null ? u8h1Var.hashCode() : 0);
    }

    public gwn0(String str, String str2, String str3, u8h1 u8h1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u8h1Var;
    }
}
