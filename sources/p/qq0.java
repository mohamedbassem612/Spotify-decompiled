package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qq0 implements yw0 {
    public final dh30 a;
    public final dt71 b;
    public final llm c;
    public final dt71 d;

    public qq0(dh30 dh30Var, q8n q8nVar) {
        this.a = dh30Var;
        dt71 dt71VarE = mgo1.e(1, 0, 2, 2);
        this.b = dt71VarE;
        this.c = l1d.x(q8nVar);
        this.d = dt71VarE;
    }

    @Override // p.yw0
    public final void start() {
        l4p1.u(this.c, x4p1.h(f5p1.q(new u70(this.a.p(), (byte) 3), new j1(this.b)), new pq0(3, null, (byte) 0)));
    }

    @Override // p.yw0
    public final void stop() {
        op71.r(this.c.a);
        this.b.d();
    }
}
