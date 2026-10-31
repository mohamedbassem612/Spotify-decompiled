package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g00 implements l10 {
    public final eln0 a;
    public final f00 b;

    public g00(eln0 eln0Var, f00 f00Var) {
        this.a = eln0Var;
        this.b = f00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g00)) {
            return false;
        }
        g00 g00Var = (g00) obj;
        return this.a.equals(g00Var.a) && this.b.equals(g00Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
