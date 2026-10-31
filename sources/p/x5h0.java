package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x5h0 implements z5h0 {
    public final String a;
    public final String b;
    public final g5h0 c;

    public x5h0(String str, String str2, g5h0 g5h0Var) {
        this.a = str;
        this.b = str2;
        this.c = g5h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5h0)) {
            return false;
        }
        x5h0 x5h0Var = (x5h0) obj;
        return u890.j(this.a, x5h0Var.a) && this.b.equals(x5h0Var.b) && this.c.equals(x5h0Var.c);
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 961, 31, this.b);
    }
}
