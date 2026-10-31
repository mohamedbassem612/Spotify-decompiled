package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k6y implements dwo {
    public final kly0 a;
    public final r0z0 b;
    public final kly0 c;
    public final w6y d;
    public final t6y e;
    public final llm f;
    public final llm g;

    public k6y(je4 je4Var, kly0 kly0Var, r0z0 r0z0Var, kly0 kly0Var2, kly0 kly0Var3, w6y w6yVar, q8n q8nVar, t6y t6yVar) {
        this.a = kly0Var;
        this.b = r0z0Var;
        this.c = kly0Var2;
        this.d = w6yVar;
        this.e = t6yVar;
        v62 v62Var = new v62((byte) 5);
        llm llmVarE = smo1.e(ilo1.B(q8nVar, guo1.B()).y(v62Var));
        this.f = llmVarE;
        this.g = smo1.e(ilo1.B(q8nVar, guo1.B()).y(v62Var));
        c921.y(llmVarE, (o8n) null, 0, new hxn(je4Var, this, kly0Var3, (lnm) null, (byte) 29), 3);
        c921.y(llmVarE, (o8n) null, 0, new p1r(je4Var, this, (lnm) null, (byte) 17), 3);
    }

    public final void shutdown() {
        smo1.q(this.f);
        ((n4f0) this.c.get()).b(new v7v(this, (byte) 27));
    }
}
