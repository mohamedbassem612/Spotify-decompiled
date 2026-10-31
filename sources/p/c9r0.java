package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c9r0 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ vr20 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ n9r0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9r0(int i, lnm lnmVar, n9r0 n9r0Var) {
        super(3, lnmVar);
        this.d = i;
        this.e = n9r0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c9r0 c9r0Var = new c9r0(this.d, (lnm) obj3, this.e);
        c9r0Var.b = (vr20) obj;
        c9r0Var.c = obj2;
        return c9r0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        huz huzVarS;
        vr20 vr20Var = this.b;
        Object obj2 = this.c;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            ima1 ima1Var = (dma1) obj2;
            if (ima1Var == null) {
                huzVarS = new huz(Boolean.FALSE, (byte) 10);
            } else {
                ima1 ima1Var2 = ima1Var;
                huzVarS = h5p1.s(new ht20(new uop0(c4p1.F(ima1Var2.o(), ima1Var2, n9r0.h, h9a1.X0), (byte) 6), new kgv(ima1Var, null, (byte) 2)), new ht20(new uop0(c4p1.F(ima1Var2.o(), ima1Var2, n9r0.i, z691.e), (byte) 7), new kgv(ima1Var, null, (byte) 3)), new ht20(new uop0(ima1Var2.q(n9r0.f), (byte) 8), new kgv(ima1Var, null, (byte) 4)), new d9r0(this.d, null, this.e));
            }
            this.b = null;
            this.c = null;
            this.a = true;
            Object objS = l4p1.s(vr20Var, huzVarS, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
