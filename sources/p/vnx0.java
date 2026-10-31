package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vnx0 extends a8d1 implements bv30 {
    public /* synthetic */ xnx0 a;
    public /* synthetic */ mox0 b;
    public /* synthetic */ box0 c;
    public /* synthetic */ tqw d;
    public final /* synthetic */ lzn0 e;
    public final /* synthetic */ l0x0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnx0(lzn0 lzn0Var, l0x0 l0x0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.e = lzn0Var;
        this.f = l0x0Var;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vnx0 vnx0Var = new vnx0(this.e, this.f, (lnm) obj5);
        vnx0Var.a = (xnx0) obj;
        vnx0Var.b = (mox0) obj2;
        vnx0Var.c = (box0) obj3;
        vnx0Var.d = (tqw) obj4;
        rih1 rih1Var = rih1.a;
        vnx0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        xnx0 xnx0Var = this.a;
        mox0 mox0Var = this.b;
        znx0 znx0Var = this.c;
        tqw tqwVar = this.d;
        hm5.M(obj);
        boolean zJ = u890.j(znx0Var, ynx0.a);
        l0x0 l0x0Var = this.f;
        if (zJ) {
            ton1.k(mox0Var.a(), tqwVar, this.e);
            ton1.l(xnx0Var.a(), l0x0Var);
        } else if (znx0Var instanceof znx0) {
            ton1.m(znx0Var.a(), xnx0Var.a(), l0x0Var);
        } else {
            if (!u890.j(znx0Var, aox0.a)) {
                eg.o();
                return null;
            }
            ton1.j(mox0Var, xnx0Var.a(), l0x0Var);
        }
        return rih1.a;
    }
}
