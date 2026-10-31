package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zw20 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ yw20 c;
    public /* synthetic */ tqw d;
    public final /* synthetic */ ax20 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw20(ax20 ax20Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = ax20Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ax20 ax20Var = this.e;
        yw20 yw20Var = (yw20) obj;
        tqw tqwVar = (tqw) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                zw20 zw20Var = new zw20(ax20Var, lnmVar, (byte) 0);
                zw20Var.c = yw20Var;
                zw20Var.d = tqwVar;
                return zw20Var.invokeSuspend(rih1Var);
            default:
                zw20 zw20Var2 = new zw20(ax20Var, lnmVar, (byte) 1);
                zw20Var2.c = yw20Var;
                zw20Var2.d = tqwVar;
                return zw20Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ax20 ax20Var = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                yw20 yw20Var = this.c;
                tqw tqwVar = this.d;
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
                if (tqwVar == null) {
                    return rih1Var;
                }
                tv80 tv80VarY = n3o1.y(tqwVar);
                tdo tdoVar = ax20Var.b;
                ww20 ww20Var = yw20Var.a.c;
                this.c = null;
                this.d = null;
                this.b = true;
                return tdoVar.a(ww20Var, tv80VarY, this) == d9nVar ? d9nVar : rih1Var;
            default:
                yw20 yw20Var2 = this.c;
                tqw tqwVar2 = this.d;
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
                if (tqwVar2 == null) {
                    return rih1Var;
                }
                tv80 tv80VarY2 = n3o1.y(tqwVar2);
                xw20 xw20Var = yw20Var2.a;
                tdo tdoVar2 = ax20Var.b;
                this.c = null;
                this.d = null;
                this.b = true;
                return tdoVar2.a(vw20.e, tv80VarY2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
