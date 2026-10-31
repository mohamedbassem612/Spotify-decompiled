package p;

import io.reactivex.rxjava3.core.Observable;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xvi1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ zvi1 c;
    public final /* synthetic */ yvi1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xvi1(yvi1 yvi1Var, zvi1 zvi1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = yvi1Var;
        this.c = zvi1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        zvi1 zvi1Var = this.c;
        yvi1 yvi1Var = this.d;
        switch (b) {
            case 0:
                return new xvi1(yvi1Var, zvi1Var, lnmVar, (byte) 0);
            case 1:
                return new xvi1(zvi1Var, yvi1Var, lnmVar, (byte) 1);
            case 2:
                return new xvi1(yvi1Var, zvi1Var, lnmVar, (byte) 2);
            case 3:
                return new xvi1(zvi1Var, yvi1Var, lnmVar, (byte) 3);
            default:
                return new xvi1(yvi1Var, zvi1Var, lnmVar, (byte) 4);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        zvi1 zvi1Var = this.c;
        yvi1 yvi1Var = this.d;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Observable observableB = yvi1Var.d.b(zvi1Var.b, zvi1Var.a);
                this.b = true;
                Object objL = fc11.l(observableB, 1, (Object) null, this);
                return objL == d9nVar ? d9nVar : objL;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (!zvi1Var.f) {
                        return uum1.a;
                    }
                    xvi1 xvi1Var = new xvi1(yvi1Var, zvi1Var, lnmVar, (byte) 0);
                    this.b = true;
                    obj = rc2.O(2000L, xvi1Var, this);
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
                return (vum1) obj;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Observable observableC = yvi1Var.a.c(zvi1Var.b);
                this.b = true;
                Object objL2 = fc11.l(observableC, 1, (Object) null, this);
                return objL2 == d9nVar ? d9nVar : objL2;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    if (!zvi1Var.g) {
                        return Boolean.FALSE;
                    }
                    xvi1 xvi1Var2 = new xvi1(yvi1Var, zvi1Var, lnmVar, (byte) 2);
                    this.b = true;
                    obj = rc2.O(2000L, xvi1Var2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return (Boolean) obj;
            default:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mwm1 mwm1Var = yvi1Var.f;
                zsm1 zsm1VarP = YourLibraryDecorateRequest.p();
                zsm1VarP.q(zvi1Var.b);
                Observable observableC2 = mwm1Var.c(zsm1VarP.build());
                this.b = true;
                Object objL3 = fc11.l(observableC2, 1, (Object) null, this);
                return objL3 == d9nVar ? d9nVar : objL3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xvi1(zvi1 zvi1Var, yvi1 yvi1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = zvi1Var;
        this.d = yvi1Var;
    }
}
