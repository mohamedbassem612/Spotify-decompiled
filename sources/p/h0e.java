package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h0e implements pd51 {
    public final String a;
    public final d8r0 b;
    public final tw01 c;

    public h0e(String str, d8r0 d8r0Var, tw01 tw01Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = tw01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0e)) {
            return false;
        }
        h0e h0eVar = (h0e) obj;
        return this.a.equals(h0eVar.a) && this.b.equals(h0eVar.b) && this.c.equals(h0eVar.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
