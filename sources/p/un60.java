package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class un60 extends iro1 {
    public final String b;
    public final String c;
    public final c9 d;
    public final String e;
    public final boolean f;
    public final int g;
    public final String h;
    public final on60 i;

    public un60(String str, String str2, c9 c9Var, String str3, boolean z, int i, String str4, on60 on60Var) {
        this.b = str;
        this.c = str2;
        this.d = c9Var;
        this.e = str3;
        this.f = z;
        this.g = i;
        this.h = str4;
        this.i = on60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un60)) {
            return false;
        }
        un60 un60Var = (un60) obj;
        return u890.j(this.b, un60Var.b) && u890.j(this.c, un60Var.c) && u890.j(this.d, un60Var.d) && u890.j(this.e, un60Var.e) && this.f == un60Var.f && this.g == un60Var.g && u890.j(this.h, un60Var.h) && u890.j(this.i, un60Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(this.b.hashCode() * 31, 31, this.c)) * 31;
        String str = this.e;
        int iK = ab80.k(this.g, xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31);
        String str2 = this.h;
        int iHashCode2 = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        on60 on60Var = this.i;
        return iHashCode2 + (on60Var != null ? on60Var.hashCode() : 0);
    }
}
