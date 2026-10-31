package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pgi0 extends a8d1 implements bv30 {
    public /* synthetic */ dgi0 a;

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        pgi0 pgi0Var = new pgi0(5, (lnm) obj5);
        pgi0Var.a = (dgi0) obj3;
        rih1 rih1Var = rih1.a;
        pgi0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        dgi0 dgi0Var = this.a;
        hm5.M(obj);
        if (dgi0Var != null) {
            return rih1.a;
        }
        eg.o();
        return null;
    }
}
