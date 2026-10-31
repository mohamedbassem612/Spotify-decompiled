package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ufo0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ tv80 b;
    public final /* synthetic */ wmy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ufo0(wmy wmyVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = wmyVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wmy wmyVar = this.c;
        tv80 tv80Var = (tv80) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                ufo0 ufo0Var = new ufo0(wmyVar, lnmVar, (byte) 0);
                ufo0Var.b = tv80Var;
                ufo0Var.invokeSuspend(rih1Var);
                break;
            default:
                ufo0 ufo0Var2 = new ufo0(wmyVar, lnmVar, (byte) 1);
                ufo0Var2.b = tv80Var;
                ufo0Var2.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wmy wmyVar = this.c;
        tv80 tv80Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                wmyVar.S(tv80Var, false);
                break;
            default:
                hm5.M(obj);
                wmyVar.S(tv80Var, true);
                break;
        }
        return rih1Var;
    }
}
