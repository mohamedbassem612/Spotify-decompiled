package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kxu extends a8d1 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxu(iyl1 iyl1Var, cyp0 cyp0Var, String str, rm5 rm5Var, tz01 tz01Var, xaz0 xaz0Var, lnm lnmVar) {
        super(1, lnmVar);
        this.c = iyl1Var;
        this.d = cyp0Var;
        this.e = str;
        this.f = rm5Var;
        this.g = tz01Var;
        this.h = xaz0Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                return new kxu((iyl1) this.c, (cyp0) obj5, (String) obj4, (rm5) obj3, (tz01) obj2, (xaz0) obj, lnmVar);
            default:
                return new kxu((vbm1) obj5, (pbm1) obj4, (ven0) obj3, (ven0) obj2, (ven0) obj, lnmVar);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objU;
        ven0 ven0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        d9n d9nVar = d9n.a;
        Object obj4 = this.f;
        Object obj5 = this.g;
        Object obj6 = this.h;
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
                cyp0 cyp0Var = (cyp0) obj3;
                reo reoVar = new reo(((iyl1) this.c).a, cyp0Var.a, cyp0Var.b);
                String str = (String) obj2;
                str.getClass();
                this.b = true;
                return qxu.c(reoVar, str, (rm5) obj4, (tz01) obj5, (xaz0) obj6, this) == d9nVar ? d9nVar : rih1Var;
            default:
                ven0 ven0Var2 = (ven0) obj6;
                ven0 ven0Var3 = (ven0) obj5;
                ven0 ven0Var4 = (ven0) obj4;
                boolean z2 = this.b;
                Object obj7 = tbm1.a;
                if (!z2) {
                    hm5.M(obj);
                    if (u890.j((ubm1) ven0Var4.getValue(), obj7) || ((Boolean) ven0Var3.getValue()).booleanValue()) {
                        return rih1Var;
                    }
                    ven0Var3.setValue(Boolean.TRUE);
                    ven0Var4.setValue(sbm1.a);
                    vbm1 vbm1Var = (vbm1) obj3;
                    kj31 kj31Var = vbm1Var.a;
                    ti31 ti31Var = vbm1Var.b;
                    String str2 = ((pbm1) obj2).a;
                    this.c = ven0Var2;
                    this.b = true;
                    objU = kkn.u(kj31Var, ti31Var, str2, this);
                    if (objU == d9nVar) {
                        return d9nVar;
                    }
                    ven0Var = ven0Var2;
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0 ven0Var5 = (ven0) this.c;
                    hm5.M(obj);
                    ven0Var = ven0Var5;
                    objU = obj;
                }
                ven0Var.setValue((wj31) objU);
                if (((wj31) ven0Var2.getValue()) == null) {
                    obj7 = rbm1.a;
                }
                ven0Var4.setValue(obj7);
                ven0Var3.setValue(Boolean.FALSE);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxu(vbm1 vbm1Var, pbm1 pbm1Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(1, lnmVar);
        this.d = vbm1Var;
        this.e = pbm1Var;
        this.f = ven0Var;
        this.g = ven0Var2;
        this.h = ven0Var3;
    }
}
