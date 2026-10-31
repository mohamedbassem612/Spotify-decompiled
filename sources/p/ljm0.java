package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ljm0 implements mqw {
    public final /* synthetic */ xas a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ o8n c;
    public final /* synthetic */ j2i d;

    public ljm0(xas xasVar, iu30 iu30Var, o8n o8nVar, j2i j2iVar) {
        this.a = xasVar;
        this.b = iu30Var;
        this.c = o8nVar;
        this.d = j2iVar;
    }

    @Override // p.mqw
    public final lqw a(Object obj, ipb1 ipb1Var) {
        wdu0 wdu0Var = wdu0.Y;
        o8n o8nVar = this.c;
        o8nVar.A(wdu0Var);
        int i = qqw.a;
        return new kjm0(o8nVar.y(o6x.a), obj, (h141) ipb1Var, this.d);
    }

    @Override // p.mqw
    public final mc41 c() {
        iir iirVar = this.a.a;
        return iirVar == null ? new o7x() : iirVar;
    }

    @Override // p.mqw
    public final Object d(Object obj) {
        return this.b.invoke(obj);
    }
}
