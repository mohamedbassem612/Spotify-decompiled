package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class baz0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public baz0(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baz0)) {
            return false;
        }
        baz0 baz0Var = (baz0) obj;
        return this.a.equals(baz0Var.a) && this.b.equals(baz0Var.b) && u890.j(this.c, baz0Var.c) && u890.j(this.d, baz0Var.d) && u890.j(this.e, baz0Var.e) && this.f == baz0Var.f && this.g == baz0Var.g && this.h == baz0Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }
}
