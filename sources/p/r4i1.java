package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r4i1 implements a5i1 {
    public final String a;
    public final g8i1 b;

    public r4i1(String str, g8i1 g8i1Var) {
        this.a = str;
        this.b = g8i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4i1)) {
            return false;
        }
        r4i1 r4i1Var = (r4i1) obj;
        return u890.j(this.a, r4i1Var.a) && this.b.equals(r4i1Var.b);
    }

    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
