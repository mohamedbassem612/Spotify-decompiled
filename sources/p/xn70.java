package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xn70 {
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ xn70(String str, String str2, int i, String str3) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn70)) {
            return false;
        }
        xn70 xn70Var = (xn70) obj;
        return u890.j(this.a, xn70Var.a) && u890.j(this.b, xn70Var.b) && u890.j(this.c, xn70Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public xn70(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
