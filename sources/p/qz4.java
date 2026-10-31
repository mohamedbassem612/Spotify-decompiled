package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qz4 implements zwz0 {
    public final poj0 a;
    public final gal b;
    public final llm c;
    public final idd1 d = new idd1(new sx4(this, (byte) 28));

    public qz4(poj0 poj0Var, gal galVar, q8n q8nVar) {
        this.a = poj0Var;
        this.b = galVar;
        this.c = smo1.e(ilo1.B(q8nVar, new z8n("AndroidReachabilityMonitor")));
    }

    @Override // p.zwz0
    public final uwz0 a() {
        uwz0 uwz0Var = (uwz0) o7h.s0(((at71) this.d.getValue()).c());
        return uwz0Var == null ? new twz0(null) : uwz0Var;
    }

    @Override // p.zwz0
    public final at71 d() {
        return (at71) this.d.getValue();
    }
}
