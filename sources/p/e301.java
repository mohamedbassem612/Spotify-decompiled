package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e301 {
    public final String a;
    public final String b;
    public final lik1 c;

    public e301(String str, String str2, lik1 lik1Var) {
        this.a = str;
        this.b = str2;
        this.c = lik1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e301)) {
            return false;
        }
        e301 e301Var = (e301) obj;
        return u890.j(this.a, e301Var.a) && u890.j(this.b, e301Var.b) && this.c.equals(e301Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
