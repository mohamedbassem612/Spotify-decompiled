package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s5h0 implements z5h0 {
    public final String a;
    public final String b;
    public final String c;
    public final d5h0 d;

    public s5h0(String str, String str2, String str3, d5h0 d5h0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d5h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5h0)) {
            return false;
        }
        s5h0 s5h0Var = (s5h0) obj;
        return u890.j(this.a, s5h0Var.a) && this.b.equals(s5h0Var.b) && u890.j(this.c, s5h0Var.c) && this.d.equals(s5h0Var.d);
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 961, 31, this.b), 31, this.c);
    }
}
