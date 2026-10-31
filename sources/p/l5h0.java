package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l5h0 implements z5h0 {
    public final String a;
    public final op80 b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public l5h0(String str, op80 op80Var, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = op80Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5h0)) {
            return false;
        }
        l5h0 l5h0Var = (l5h0) obj;
        return u890.j(this.a, l5h0Var.a) && u890.j(this.b, l5h0Var.b) && u890.j(this.c, l5h0Var.c) && u890.j(this.d, l5h0Var.d) && u890.j(this.e, l5h0Var.e) && this.f == l5h0Var.f;
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        op80 op80Var = this.b;
        return Boolean.hashCode(this.f) + cy30.d(cy30.d(cy30.d((iHashCode + (op80Var == null ? 0 : op80Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public /* synthetic */ l5h0(String str, String str2, String str3, String str4) {
        this(str, null, str2, str3, str4, false);
    }
}
