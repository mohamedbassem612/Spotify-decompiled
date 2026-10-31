package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aou0 {
    public final znu0 a;
    public final String b;
    public final x4i1 c;
    public final String d;
    public final String e;
    public final String f;

    public aou0(znu0 znu0Var, String str, x4i1 x4i1Var, String str2, String str3, String str4) {
        this.a = znu0Var;
        this.b = str;
        this.c = x4i1Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aou0)) {
            return false;
        }
        aou0 aou0Var = (aou0) obj;
        return u890.j(this.a, aou0Var.a) && u890.j(this.b, aou0Var.b) && u890.j(this.c, aou0Var.c) && u890.j(this.d, aou0Var.d) && u890.j(this.e, aou0Var.e) && u890.j(this.f, aou0Var.f);
    }

    public final int hashCode() {
        znu0 znu0Var = this.a;
        int iHashCode = (znu0Var == null ? 0 : znu0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        x4i1 x4i1Var = this.c;
        int iHashCode3 = (iHashCode2 + (x4i1Var == null ? 0 : x4i1Var.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }
}
