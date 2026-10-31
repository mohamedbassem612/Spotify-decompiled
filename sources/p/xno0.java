package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xno0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public xno0(int i, String str, String str2, String str3, String str4, String str5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xno0)) {
            return false;
        }
        xno0 xno0Var = (xno0) obj;
        return this.a == xno0Var.a && u890.j(this.b, xno0Var.b) && u890.j(this.c, xno0Var.c) && u890.j(this.d, xno0Var.d) && u890.j(this.e, xno0Var.e) && u890.j(this.f, xno0Var.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }
}
