package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hx80 implements f961, nw80 {
    public final vi11 a;
    public final n381 b;
    public final ax80 c;
    public final llm d;

    public hx80(vi11 vi11Var, n381 n381Var, ax80 ax80Var, llm llmVar) {
        this.a = vi11Var;
        this.b = n381Var;
        this.c = ax80Var;
        this.d = llmVar;
        c921.y(llmVar, (o8n) null, 0, new zx0(this, null, (byte) 7), 3);
        c921.y(llmVar, (o8n) null, 0, new no70(this, (lnm) null, (byte) 7), 3);
    }

    @Override // p.nw80
    public final Object a(lnm lnmVar) {
        return this.c.a(lnmVar);
    }

    @Override // p.nw80
    public final bx80 b() {
        return this.c.b();
    }

    @Override // p.nw80
    public final zob1 c() {
        return this.c.t;
    }

    @Override // p.nw80
    public final cx80 d(g38 g38Var) {
        return this.c.d(g38Var);
    }

    @Override // p.nw80
    public final void e(ou80 ou80Var) {
        this.c.e(ou80Var);
    }

    public final void shutdown() {
        smo1.q(this.d);
        this.b.p();
    }

    public final Object getApi() {
        return this;
    }
}
