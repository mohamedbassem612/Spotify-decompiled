package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p7k0 implements hk90 {
    public final d0r a;
    public final String b;
    public final v6q c;
    public final jbk0 d;
    public final yd91 e = new yd91(v1j.a, v1j.b, new z8i0(this, (byte) 25));
    public final bnj0 f = new bnj0(this);

    public p7k0(d0r d0rVar, String str, z6k0 z6k0Var, v6q v6qVar, jbk0 jbk0Var) {
        this.a = d0rVar;
        this.b = str;
        this.c = v6qVar;
        this.d = jbk0Var;
    }

    @Override // p.pk90
    public final m381 c() {
        return this.f;
    }

    @Override // p.pk90
    public final yd91 d() {
        return this.e;
    }
}
