package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sx41 extends xyn1 {
    public final String b;
    public final tv80 c;
    public final long d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ sx41(String str, tv80 tv80Var, long j, String str2, boolean z, int i) {
        this(str, tv80Var, j, str2, (i & 16) != 0 ? false : z, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx41)) {
            return false;
        }
        sx41 sx41Var = (sx41) obj;
        return u890.j(this.b, sx41Var.b) && u890.j(this.c, sx41Var.c) && this.d == sx41Var.d && u890.j(this.e, sx41Var.e) && this.f == sx41Var.f && this.g == sx41Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        tv80 tv80Var = this.c;
        return Boolean.hashCode(this.g) + xcg1.g(cy30.d(cy30.f((iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31, this.d, 31), 31, this.e), 31, this.f);
    }

    public sx41(String str, tv80 tv80Var, long j, String str2, boolean z, boolean z2) {
        this.b = str;
        this.c = tv80Var;
        this.d = j;
        this.e = str2;
        this.f = z;
        this.g = z2;
    }
}
