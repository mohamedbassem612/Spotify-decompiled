package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n551 {
    public final e7r0 a;
    public final int b;
    public final f951 c;

    public n551(e7r0 e7r0Var, int i, f951 f951Var) {
        this.a = e7r0Var;
        this.b = i;
        this.c = f951Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n551)) {
            return false;
        }
        n551 n551Var = (n551) obj;
        return u890.j(this.a, n551Var.a) && this.b == n551Var.b && u890.j(this.c, n551Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
