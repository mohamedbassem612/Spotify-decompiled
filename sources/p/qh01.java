package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qh01 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ dh01 b;
    public final /* synthetic */ uh01 c;
    public final /* synthetic */ ah01 d;
    public final /* synthetic */ tto1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ tqw g;
    public final /* synthetic */ tob1 h;
    public final /* synthetic */ tob1 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh01(dh01 dh01Var, uh01 uh01Var, ah01 ah01Var, tto1 tto1Var, boolean z, tqw tqwVar, tob1 tob1Var, tob1 tob1Var2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = dh01Var;
        this.c = uh01Var;
        this.d = ah01Var;
        this.e = tto1Var;
        this.f = z;
        this.g = tqwVar;
        this.h = tob1Var;
        this.i = tob1Var2;
        this.t = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new qh01(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            bh01 bh01Var = bh01.a;
            dh01 dh01Var = this.b;
            boolean zJ = u890.j(dh01Var, bh01Var);
            ven0 ven0Var = this.t;
            if (zJ) {
                x440 x440Var = (x440) this.h.getValue();
                boolean zBooleanValue = ((Boolean) this.i.getValue()).booleanValue();
                r9y0 r9y0Var = new r9y0(ven0Var, (byte) 4);
                this.a = true;
                Object objH = this.c.h(this.d, x440Var, this.e, this.f, zBooleanValue, this.g, r9y0Var, this);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!u890.j(dh01Var, ch01.a)) {
                    eg.o();
                    return null;
                }
                ven0Var.setValue(oh01.a);
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
