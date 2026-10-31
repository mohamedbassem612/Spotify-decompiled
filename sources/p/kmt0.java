package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kmt0 extends a8d1 implements bv30 {
    public /* synthetic */ nnt0 a;
    public /* synthetic */ zmt0 b;
    public /* synthetic */ tqw c;
    public final /* synthetic */ lzn0 d;
    public final /* synthetic */ vgm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmt0(lzn0 lzn0Var, vgm vgmVar, lnm lnmVar) {
        super(5, lnmVar);
        this.d = lzn0Var;
        this.e = vgmVar;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kmt0 kmt0Var = new kmt0(this.d, this.e, (lnm) obj5);
        kmt0Var.a = (nnt0) obj2;
        kmt0Var.b = (zmt0) obj3;
        kmt0Var.c = (tqw) obj4;
        rih1 rih1Var = rih1.a;
        kmt0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        nnt0 nnt0Var = this.a;
        zmt0 zmt0Var = this.b;
        tqw tqwVar = this.c;
        hm5.M(obj);
        boolean zJ = u890.j(zmt0Var, vmt0.a);
        lzn0 lzn0Var = this.d;
        if (zJ) {
            hqn1.r(nnt0Var.c(), tqwVar, lzn0Var);
        } else if (u890.j(zmt0Var, umt0.a)) {
            if (nnt0Var.b() instanceof vdo) {
                hqn1.r(nnt0Var.c(), tqwVar, lzn0Var);
            }
        } else if (u890.j(zmt0Var, wmt0.a) && tqwVar != null) {
            vgm.b(this.e, nnt0Var.c(), (String) null, n3o1.y(tqwVar), lmt0.r(nnt0Var), 2);
        }
        return rih1.a;
    }
}
