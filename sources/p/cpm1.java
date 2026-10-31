package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cpm1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ r4h1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cpm1(lnm lnmVar, r4h1 r4h1Var, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = r4h1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r4h1 r4h1Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                cpm1 cpm1Var = new cpm1(lnmVar, r4h1Var, (byte) 0);
                cpm1Var.c = vr20Var;
                cpm1Var.d = obj2;
                return cpm1Var.invokeSuspend(rih1Var);
            case 1:
                cpm1 cpm1Var2 = new cpm1(lnmVar, r4h1Var, (byte) 1);
                cpm1Var2.c = vr20Var;
                cpm1Var2.d = obj2;
                return cpm1Var2.invokeSuspend(rih1Var);
            default:
                cpm1 cpm1Var3 = new cpm1(lnmVar, r4h1Var, (byte) 2);
                cpm1Var3.c = vr20Var;
                cpm1Var3.d = obj2;
                return cpm1Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        jge huzVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r4h1 r4h1Var = this.e;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
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
                huz huzVar2 = !((Boolean) obj2).booleanValue() ? new huz(Boolean.FALSE, (byte) 10) : rqt0.u(new lmf(((jed0) r4h1Var.b).b(), (byte) 6));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
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
                huz huzVar3 = ((Boolean) obj3).booleanValue() ? new huz(apm1.a, (byte) 10) : hu20.e(rqt0.u(new lmf(((jed0) r4h1Var.b).b(), (byte) 7)), new cpm1(lnmVar, r4h1Var, (byte) 2));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVar3, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var3 = this.c;
                Object obj4 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (((Boolean) obj4).booleanValue()) {
                    Flowable flowable = (Flowable) r4h1Var.c;
                    vbm[] vbmVarArr = q601.a;
                    huzVar = hu20.e(rqt0.w(new kge(flowable), gbm1.Y0, rqt0.b), new y3s((lnm) null, r4h1Var, (byte) 12));
                } else {
                    huzVar = new huz(yom1.a, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var3, huzVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
