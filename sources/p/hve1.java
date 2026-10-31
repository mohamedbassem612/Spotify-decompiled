package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hve1 extends fn41 implements Runnable {
    public final long f;

    public hve1(long j, lnm lnmVar) {
        super(lnmVar, lnmVar.getContext());
        this.f = j;
    }

    @Override // p.q6, p.saa0
    public final String o0() {
        return v8r.l(this) + "(timeMillis=" + this.f + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        o8n o8nVar = this.d;
        hap1.l(o8nVar);
        z8n z8nVar = (z8n) o8nVar.A(z8n.c);
        R(rc2.i(this.f, this, z8nVar != null ? z8nVar.b : null));
    }
}
