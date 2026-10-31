package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x6v0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public x6v0(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6v0)) {
            return false;
        }
        x6v0 x6v0Var = (x6v0) obj;
        return this.a.equals(x6v0Var.a) && this.b.equals(x6v0Var.b) && u890.j(this.c, x6v0Var.c) && u890.j(this.d, x6v0Var.d) && this.e == x6v0Var.e && this.f == x6v0Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.f) + xcg1.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }
}
