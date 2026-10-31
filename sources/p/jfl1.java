package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jfl1 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ jfl1(int i, int i2, String str, String str2, String str3, int i3) {
        this(i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) == 0 ? 2131234023 : 0, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfl1)) {
            return false;
        }
        jfl1 jfl1Var = (jfl1) obj;
        return this.a == jfl1Var.a && this.b == jfl1Var.b && this.c == jfl1Var.c && u890.j(this.d, jfl1Var.d) && u890.j(this.e, jfl1Var.e) && u890.j(this.f, jfl1Var.f) && u890.j(this.g, jfl1Var.g);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kaa0.f(this.b, l1d.C(this.a) * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public jfl1(int i, int i2, int i3, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }
}
