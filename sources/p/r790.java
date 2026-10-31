package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r790 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ uoa b;
    public final /* synthetic */ o2u0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r790(uoa uoaVar, o2u0 o2u0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = uoaVar;
        this.c = o2u0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new r790(this.c, this.b, lnmVar);
            default:
                return new r790(this.b, this.c, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o2u0 o2u0Var = this.c;
        uoa uoaVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (o2u0Var != null) {
                    uoaVar.h(o2u0Var, new oot0(0L, 0L, false, false, (hu7) null, (tne1) null, false, 254));
                }
                break;
            default:
                hm5.M(obj);
                uoaVar.g(o2u0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r790(o2u0 o2u0Var, uoa uoaVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = o2u0Var;
        this.b = uoaVar;
    }
}
