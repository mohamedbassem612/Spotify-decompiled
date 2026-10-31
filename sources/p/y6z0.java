package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y6z0 extends a8d1 implements bv30 {
    public /* synthetic */ tqw a;
    public final /* synthetic */ bs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6z0(bs0 bs0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.b = bs0Var;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        y6z0 y6z0Var = new y6z0(this.b, (lnm) obj5);
        y6z0Var.a = (tqw) obj4;
        rih1 rih1Var = rih1.a;
        y6z0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        tqw tqwVar = this.a;
        hm5.M(obj);
        g5p0.b(bs0.f(this.b), tqwVar != null ? n3o1.y(tqwVar).a : null, 2);
        return rih1.a;
    }
}
