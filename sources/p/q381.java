package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q381 {
    public final String a;
    public final up11 b;
    public final d281 c;

    public q381(String str, up11 up11Var, d281 d281Var) {
        this.a = str;
        this.b = up11Var;
        this.c = d281Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q381)) {
            return false;
        }
        q381 q381Var = (q381) obj;
        return u890.j(this.a, q381Var.a) && this.b.equals(q381Var.b) && this.c == q381Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
