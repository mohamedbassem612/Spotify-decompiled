package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cm1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;

    public cm1(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm1)) {
            return false;
        }
        cm1 cm1Var = (cm1) obj;
        return this.a.equals(cm1Var.a) && u890.j(this.b, cm1Var.b) && this.c == cm1Var.c && u890.j(this.d, cm1Var.d) && this.e == cm1Var.e && u890.j(this.f, cm1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iG2 = xcg1.g((iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        return iG2 + (str3 != null ? str3.hashCode() : 0);
    }
}
