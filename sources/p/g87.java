package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g87 {
    public final c380 a;
    public final String b;
    public final iu30 c;

    public g87(c380 c380Var, String str, iu30 iu30Var) {
        this.a = c380Var;
        this.b = str;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g87)) {
            return false;
        }
        g87 g87Var = (g87) obj;
        return u890.j(this.a, g87Var.a) && u890.j(this.b, g87Var.b) && this.c.equals(g87Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
