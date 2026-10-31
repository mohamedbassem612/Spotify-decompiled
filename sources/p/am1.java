package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class am1 implements tey0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public am1(int i, String str, String str2, String str3, boolean z, boolean z2) {
        str2 = (i & 2) != 0 ? null : str2;
        z = (i & 8) != 0 ? true : z;
        z2 = (i & 16) != 0 ? false : z2;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am1)) {
            return false;
        }
        am1 am1Var = (am1) obj;
        return u890.j(this.a, am1Var.a) && u890.j(this.b, am1Var.b) && this.c.equals(am1Var.c) && this.d == am1Var.d && this.e == am1Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.e) + xcg1.g(cy30.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }
}
