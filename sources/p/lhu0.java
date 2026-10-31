package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lhu0 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final fhu0 c;

    public lhu0(String str, d8r0 d8r0Var, fhu0 fhu0Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = fhu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhu0)) {
            return false;
        }
        lhu0 lhu0Var = (lhu0) obj;
        return this.a.equals(lhu0Var.a) && this.b.equals(lhu0Var.b) && this.c.equals(lhu0Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
