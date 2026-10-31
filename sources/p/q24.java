package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q24 implements r6v {
    public final /* synthetic */ byte a = 1;
    public final p24 b;
    public final /* synthetic */ Object c;

    public q24(s24 s24Var) {
        this.c = s24Var;
        this.b = new p24(s24Var, (byte) 0);
    }

    @Override // p.r6v
    public final Object a(swn swnVar, rzu rzuVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        hfn0 hfn0Var = hfn0.b;
        switch (b) {
            case 0:
                Object objR = ((s24) obj).r(hfn0Var, new ew0(this, swnVar, (lnm) null, (byte) 1), rzuVar);
                return objR == d9nVar ? objR : rih1Var;
            default:
                Object objA = ((r24) obj).a(hfn0Var, new ew0(this, swnVar, (lnm) null, (byte) 2), rzuVar);
                return objA == d9nVar ? objA : rih1Var;
        }
    }

    public q24(r24 r24Var) {
        this.c = r24Var;
        this.b = new p24(r24Var, (byte) 1);
    }
}
