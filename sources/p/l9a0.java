package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l9a0 {
    public static final l9a0 d = new l9a0(new vxa1(m9a0.b(0.26d, 1.0d)), new vxa1(m9a0.b(0.219d, 0.4d)), new vxa1(m9a0.b(0.0d, 0.1d)));
    public final vxa1 a;
    public final vxa1 b;
    public final vxa1 c;

    public l9a0(vxa1 vxa1Var, vxa1 vxa1Var2, vxa1 vxa1Var3) {
        this.a = vxa1Var;
        this.b = vxa1Var2;
        this.c = vxa1Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9a0)) {
            return false;
        }
        l9a0 l9a0Var = (l9a0) obj;
        return this.a.equals(l9a0Var.a) && this.b.equals(l9a0Var.b) && this.c.equals(l9a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
