package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class omh implements nwo0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ omh(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // p.nwo0
    public final owo0 a(q2p0 q2p0Var, ivn0 ivn0Var, v1r0 v1r0Var, kko kkoVar) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new pmh((ifh) obj3, (xid) obj2, q2p0Var, (s4p0) obj);
            case 1:
                return new o740((uu00) obj3, (sp00) obj2, (rzo0) obj);
            case 2:
                return new p701((ha01) obj3, (hbg1) obj2, q2p0Var.i(), new o701(q2p0Var), ((k55) obj).a());
            default:
                return new il11((rvp) obj3, (uvp) obj2, kkoVar, (lv4) obj, (byte) 0);
        }
    }
}
