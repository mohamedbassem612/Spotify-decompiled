package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w2v0 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final u2v0 c;

    public w2v0(String str, d8r0 d8r0Var, u2v0 u2v0Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = u2v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2v0)) {
            return false;
        }
        w2v0 w2v0Var = (w2v0) obj;
        return this.a.equals(w2v0Var.a) && this.b.equals(w2v0Var.b) && this.c.equals(w2v0Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
