package p;

import com.spotify.pamviewservice.v1.proto.PremiumPlanRow;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nua extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ oua d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nua(oua ouaVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = ouaVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        oua ouaVar = this.d;
        switch (b) {
            case 0:
                nua nuaVar = new nua(ouaVar, lnmVar, (byte) 0);
                nuaVar.c = obj;
                return nuaVar;
            default:
                nua nuaVar2 = new nua(ouaVar, lnmVar, (byte) 1);
                nuaVar2.c = obj;
                return nuaVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((uqo) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        oua ouaVar = this.d;
        String str = null;
        switch (b) {
            case 0:
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    xab1 xab1VarT = fn31.T(ssw0Var, (o8n) null, 0, new ta9(ssw0Var, null, (byte) 1), 3);
                    ve01 ve01Var = ouaVar.e.b;
                    h50 h50Var = new h50(xab1VarT, ssw0Var, ouaVar, (byte) 10);
                    this.c = null;
                    this.b = true;
                    if (ve01Var.a.collect(h50Var, this) == d9nVar) {
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
            default:
                uqo uqoVar = (uqo) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    ve01 ve01Var2 = ouaVar.e.b;
                    this.c = uqoVar;
                    this.b = true;
                    obj = b5p1.i(ve01Var2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                PremiumPlanRow premiumPlanRow = (PremiumPlanRow) obj;
                String strR = premiumPlanRow.r();
                if (strR == null) {
                    strR = zmo1.t(ouaVar.a, uqoVar.a, uqoVar.b);
                    strR.getClass();
                }
                String strQ = premiumPlanRow.q();
                if (strQ != null && strQ.length() != 0) {
                    str = strQ;
                }
                return new kua(strR, str, premiumPlanRow.p());
        }
    }
}
