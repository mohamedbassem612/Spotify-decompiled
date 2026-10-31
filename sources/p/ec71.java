package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ec71 {
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ ec71(int i, String str, String str2) {
        this(str, (i & 2) != 0 ? null : str2, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec71)) {
            return false;
        }
        ec71 ec71Var = (ec71) obj;
        return u890.j(this.a, ec71Var.a) && u890.j(this.b, ec71Var.b) && u890.j(this.c, ec71Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public ec71(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
