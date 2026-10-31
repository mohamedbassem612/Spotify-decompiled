package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nah1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ obh1 c;
    public final /* synthetic */ lbh1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nah1(obh1 obh1Var, lbh1 lbh1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obh1Var;
        this.d = lbh1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        lbh1 lbh1Var = this.d;
        obh1 obh1Var = this.c;
        switch (b) {
            case 0:
                return new nah1(obh1Var, lbh1Var, lnmVar, (byte) 0);
            default:
                return new nah1(obh1Var, lbh1Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lbh1 lbh1Var = this.d;
        obh1 obh1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return obh1Var.e(lbh1Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return obh1Var.a(lbh1Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
