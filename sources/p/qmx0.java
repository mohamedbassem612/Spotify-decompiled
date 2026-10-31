package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qmx0 extends a8d1 implements bv30 {
    public /* synthetic */ tmx0 a;
    public /* synthetic */ umx0 b;
    public /* synthetic */ o600 c;
    public /* synthetic */ tqw d;
    public final /* synthetic */ lzn0 e;
    public final /* synthetic */ vgm f;
    public final /* synthetic */ l0x0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmx0(lzn0 lzn0Var, vgm vgmVar, l0x0 l0x0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.e = lzn0Var;
        this.f = vgmVar;
        this.g = l0x0Var;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vgm vgmVar = this.f;
        l0x0 l0x0Var = this.g;
        qmx0 qmx0Var = new qmx0(this.e, vgmVar, l0x0Var, (lnm) obj5);
        qmx0Var.a = (tmx0) obj;
        qmx0Var.b = (umx0) obj2;
        qmx0Var.c = (o600) obj3;
        qmx0Var.d = (tqw) obj4;
        rih1 rih1Var = rih1.a;
        qmx0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        tmx0 tmx0Var = this.a;
        umx0 umx0Var = this.b;
        o600 o600Var = this.c;
        tqw tqwVar = this.d;
        hm5.M(obj);
        if (u890.j(o600Var, lwz.a)) {
            men1.k(umx0Var, tqwVar, this.e);
        } else if (u890.j(o600Var, owz.a)) {
            men1.l(umx0Var, tqwVar, this.f);
        }
        men1.n(tmx0Var, umx0Var, o600Var, this.g);
        return rih1.a;
    }
}
