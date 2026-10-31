package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m7k0 implements kk90 {
    public final String a;
    public final d0r b;
    public final jbk0 c;
    public final yd91 d;
    public final drj0 e = new drj0(this);

    public m7k0(String str, d0r d0rVar, z6k0 z6k0Var, nfq nfqVar, jbk0 jbk0Var) {
        this.a = str;
        this.b = d0rVar;
        this.c = jbk0Var;
        this.d = new yd91(3, new dvg0(nfqVar, this, (byte) 16));
    }

    @Override // p.pk90
    public final m381 c() {
        return this.e;
    }

    @Override // p.pk90
    public final yd91 d() {
        return this.d;
    }
}
