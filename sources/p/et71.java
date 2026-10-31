package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class et71 extends ca {
    public long a;
    public ohd b;

    @Override // p.ca
    public final boolean a(ba baVar) {
        dt71 dt71Var = (dt71) baVar;
        if (this.a >= 0) {
            return false;
        }
        long j = dt71Var.i;
        if (j < dt71Var.t) {
            dt71Var.t = j;
        }
        this.a = j;
        return true;
    }

    @Override // p.ca
    public final lnm[] b(ba baVar) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((dt71) baVar).w(j);
    }
}
