package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e0h0 implements k0h0 {
    public final String a;
    public final c380 b;
    public final String c;
    public final String d;
    public final tv80 e;
    public final boolean f;
    public final String g;
    public final long h;

    public e0h0(String str, c380 c380Var, String str2, String str3, tv80 tv80Var, boolean z, String str4, long j) {
        this.a = str;
        this.b = c380Var;
        this.c = str2;
        this.d = str3;
        this.e = tv80Var;
        this.f = z;
        this.g = str4;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0h0)) {
            return false;
        }
        e0h0 e0h0Var = (e0h0) obj;
        return u890.j(this.a, e0h0Var.a) && u890.j(this.b, e0h0Var.b) && u890.j(this.c, e0h0Var.c) && u890.j(this.d, e0h0Var.d) && u890.j(this.e, e0h0Var.e) && this.f == e0h0Var.f && u890.j(this.g, e0h0Var.g) && this.h == e0h0Var.h;
    }

    public final int hashCode() {
        int iF = kk0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        tv80 tv80Var = this.e;
        return Long.hashCode(this.h) + cy30.d(xcg1.g((iHashCode2 + (tv80Var != null ? tv80Var.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public /* synthetic */ e0h0(String str, c380 c380Var, String str2, String str3, tv80 tv80Var, boolean z, long j) {
        this(str, c380Var, str2, str3, tv80Var, z, "text", j);
    }
}
