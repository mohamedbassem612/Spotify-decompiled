package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ke10 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public /* synthetic */ ke10(int i, int i2, String str, String str2, String str3, String str4) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, true, (i2 & 16) != 0 ? null : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke10)) {
            return false;
        }
        ke10 ke10Var = (ke10) obj;
        return u890.j(this.a, ke10Var.a) && this.b == ke10Var.b && u890.j(this.c, ke10Var.c) && u890.j(this.d, ke10Var.d) && u890.j(this.e, ke10Var.e) && this.f == ke10Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iK = ab80.k(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        int iHashCode = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public ke10(String str, int i, String str2, String str3, boolean z, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }
}
