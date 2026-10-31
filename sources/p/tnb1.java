package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tnb1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public tnb1(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnb1)) {
            return false;
        }
        tnb1 tnb1Var = (tnb1) obj;
        return u890.j(this.a, tnb1Var.a) && u890.j(this.b, tnb1Var.b) && u890.j(this.c, tnb1Var.c) && this.d == tnb1Var.d && u890.j(this.e, tnb1Var.e) && this.f == tnb1Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iG + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ tnb1() {
        this("", null, "", null, false, false);
    }
}
