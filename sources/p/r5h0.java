package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r5h0 implements z5h0 {
    public final String a;
    public final c380 b;
    public final String c;

    public r5h0(String str, String str2, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5h0)) {
            return false;
        }
        r5h0 r5h0Var = (r5h0) obj;
        return this.a.equals(r5h0Var.a) && u890.j(this.b, r5h0Var.b) && u890.j(this.c, r5h0Var.c);
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.f(this.b, this.a.hashCode() * 961, 31);
    }
}
