package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zyn implements nwo0 {
    public final /* synthetic */ byte a;
    public final lv4 b;
    public final Object c;
    public final Object d;
    public final Object e;

    public zyn(m1q m1qVar, pzb0 pzb0Var, lv4 lv4Var, jjh1 jjh1Var) {
        this.a = (byte) 1;
        this.c = m1qVar;
        this.d = pzb0Var;
        this.b = lv4Var;
        this.e = jjh1Var;
    }

    @Override // p.nwo0
    public final owo0 a(q2p0 q2p0Var, ivn0 ivn0Var, v1r0 v1r0Var, kko kkoVar) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return new azn((yyn) obj3, (avp) obj2, kkoVar, (mv4) obj, this.b);
            case 1:
                return new fzb0((m1q) obj3, new ft30(1, (pzb0) obj2, pzb0.class, "loadContentFor", "loadContentFor(Lcom/spotify/player/model/ContextTrack;)Lio/reactivex/rxjava3/core/Maybe;", 0, (byte) 29), this.b, (jjh1) obj);
            default:
                return new il11((r2a1) obj3, (zb91) obj2, new ojm((lzn0) obj), this.b, (byte) 1);
        }
    }

    public /* synthetic */ zyn(Object obj, Object obj2, Object obj3, lv4 lv4Var, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = lv4Var;
    }
}
