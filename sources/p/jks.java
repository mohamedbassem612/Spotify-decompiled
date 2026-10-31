package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jks implements xwh0 {
    public final p7s a;
    public final ewh0 b;
    public final rs31 c;
    public final q8n d;
    public c9n e;
    public final dt71 f = mgo1.e(0, 64, 0, 5);

    public jks(p7s p7sVar, ewh0 ewh0Var, rs31 rs31Var, q8n q8nVar) {
        this.a = p7sVar;
        this.b = ewh0Var;
        this.c = rs31Var;
        this.d = q8nVar;
        this.e = cy30.t(q8nVar);
    }

    @Override // p.xwh0
    public final void a() {
        smo1.q(this.e);
    }

    @Override // p.xwh0
    public final void b() {
        c9n c9nVarC = foo1.C(this.e, new dor(this, (byte) 27));
        this.e = c9nVarC;
        c921.y(c9nVarC, (o8n) null, 0, new n1o(this, (lnm) null, (byte) 21), 3);
    }

    public final evz c() {
        return f5p1.m(this.f, rc11.a.b(bzc.class));
    }
}
