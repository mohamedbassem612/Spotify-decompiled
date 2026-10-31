package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j2n implements pd51 {
    public final String a;
    public final d8r0 b;
    public final i2n c;

    public j2n(String str, d8r0 d8r0Var, i2n i2nVar) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i2nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2n)) {
            return false;
        }
        j2n j2nVar = (j2n) obj;
        return this.a.equals(j2nVar.a) && this.b.equals(j2nVar.b) && this.c.equals(j2nVar.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
