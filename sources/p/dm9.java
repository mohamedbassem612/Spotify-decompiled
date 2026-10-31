package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dm9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dm9(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm9)) {
            return false;
        }
        dm9 dm9Var = (dm9) obj;
        return u890.j(this.a, dm9Var.a) && this.b.equals(dm9Var.b) && u890.j(this.c, dm9Var.c) && u890.j(this.d, dm9Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
