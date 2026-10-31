package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n5h0 implements z5h0 {
    public final String a;
    public final String b;
    public final String c;
    public final z4h0 d;
    public final boolean e;

    public n5h0(String str, String str2, String str3, z4h0 z4h0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z4h0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5h0)) {
            return false;
        }
        n5h0 n5h0Var = (n5h0) obj;
        return this.a.equals(n5h0Var.a) && this.b.equals(n5h0Var.b) && this.c.equals(n5h0Var.c) && this.d.equals(n5h0Var.d) && this.e == n5h0Var.e;
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 961, 31, this.b), 31, this.c)) * 31);
    }
}
