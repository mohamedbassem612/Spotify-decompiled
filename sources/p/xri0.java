package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xri0 implements yri0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public xri0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xri0)) {
            return false;
        }
        xri0 xri0Var = (xri0) obj;
        return this.a.equals(xri0Var.a) && this.b.equals(xri0Var.b) && this.c.equals(xri0Var.c) && u890.j(this.d, xri0Var.d) && u890.j(this.e, xri0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
