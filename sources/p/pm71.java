package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pm71 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ sm71 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pm71(sm71 sm71Var, iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = sm71Var;
        this.d = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iu30 iu30Var = this.d;
        sm71 sm71Var = this.c;
        switch (b) {
            case 0:
                return new pm71(sm71Var, iu30Var, lnmVar, (byte) 0);
            default:
                return new pm71(sm71Var, iu30Var, lnmVar, (byte) 1);
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
        iu30 iu30Var = this.d;
        sm71 sm71Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarB = sm71Var.h.b(new uh71(rc11.a.b(elw0.class), null));
                lm31 lm31Var = new lm31(iu30Var, sm71Var);
                this.b = true;
                return mr20VarB.collect(lm31Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarB2 = sm71Var.h.b(new uh71(rc11.a.b(omt.class), null));
                lm31 lm31Var2 = new lm31(iu30Var, (byte) 6);
                this.b = true;
                return mr20VarB2.collect(lm31Var2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
