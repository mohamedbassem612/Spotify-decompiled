package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w6k1 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final y6k1 c;

    public w6k1(String str, d8r0 d8r0Var, y6k1 y6k1Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = y6k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6k1)) {
            return false;
        }
        w6k1 w6k1Var = (w6k1) obj;
        return this.a.equals(w6k1Var.a) && this.b.equals(w6k1Var.b) && this.c.equals(w6k1Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
