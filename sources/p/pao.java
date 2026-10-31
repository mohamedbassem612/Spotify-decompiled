package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pao implements pd51 {
    public final String a;
    public final d8r0 b;
    public final mao c;

    public pao(String str, d8r0 d8r0Var, mao maoVar) {
        this.a = str;
        this.b = d8r0Var;
        this.c = maoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pao)) {
            return false;
        }
        pao paoVar = (pao) obj;
        return this.a.equals(paoVar.a) && this.b.equals(paoVar.b) && this.c.equals(paoVar.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
