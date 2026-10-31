package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fs50 extends hs50 {
    public final cho0 a;
    public final cvy0 b;
    public final String c;

    public fs50(cho0 cho0Var, cvy0 cvy0Var, String str) {
        this.a = cho0Var;
        this.b = cvy0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs50)) {
            return false;
        }
        fs50 fs50Var = (fs50) obj;
        return this.a.equals(fs50Var.a) && u890.j(this.b, fs50Var.b) && u890.j(this.c, fs50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
