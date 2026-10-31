package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t4m1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y4m1 d;
    public final /* synthetic */ bma1 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4m1(y4m1 y4m1Var, bma1 bma1Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = y4m1Var;
        this.e = bma1Var;
        this.f = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                t4m1 t4m1Var = new t4m1(this.d, this.e, this.f, lnmVar, (byte) 0);
                t4m1Var.c = obj;
                return t4m1Var;
            default:
                t4m1 t4m1Var2 = new t4m1(this.d, this.e, this.f, lnmVar, (byte) 1);
                t4m1Var2.c = obj;
                return t4m1Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.f;
        y4m1 y4m1Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    this.c = vr20Var;
                    this.b = (byte) 1;
                    objA = y4m1Var.a(this);
                    if (objA != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objA = obj;
                bek1 bek1Var = new bek1(str, (byte) 11);
                ima1 ima1Var = (dma1) objA;
                bma1 bma1Var = this.e;
                mr20 mr20VarU = rqt0.u(new ht20(new vlj1(ima1Var.s(bma1Var), bek1Var, (byte) 11), new g1y(bek1Var, ima1Var, bma1Var, (lnm) null, (byte) 6)));
                this.c = null;
                this.b = (byte) 2;
                if (l4p1.s(vr20Var, mr20VarU, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                vr20 vr20Var2 = (vr20) this.c;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    this.c = vr20Var2;
                    this.b = (byte) 1;
                    objA2 = y4m1Var.a(this);
                    if (objA2 != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objA2 = obj;
                bek1 bek1Var2 = new bek1(str, (byte) 12);
                ima1 ima1Var2 = (dma1) objA2;
                bma1 bma1Var2 = this.e;
                mr20 mr20VarU2 = rqt0.u(new ht20(new vlj1(ima1Var2.s(bma1Var2), bek1Var2, (byte) 12), new nsf1(bek1Var2, ima1Var2, bma1Var2, (lnm) null, (byte) 21)));
                this.c = null;
                this.b = (byte) 2;
                if (l4p1.s(vr20Var2, mr20VarU2, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
