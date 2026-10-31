package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hqp0 implements wma {
    public final yna a;
    public final hna b;
    public final kl1 c;
    public final uqp0 d;
    public final q8n e;
    public int f;
    public int g;
    public volatile boolean h;

    public hqp0(yna ynaVar, hna hnaVar, kl1 kl1Var, uqp0 uqp0Var, q8n q8nVar) {
        this.a = ynaVar;
        this.b = hnaVar;
        this.c = kl1Var;
        this.d = uqp0Var;
        this.e = q8nVar;
    }

    @Override // p.wma
    public final vma a(qyu qyuVar) {
        return new fqp0(this);
    }
}
