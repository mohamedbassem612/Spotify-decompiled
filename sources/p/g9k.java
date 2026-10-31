package p;

import io.reactivex.rxjava3.core.Observable;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g9k extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ h9k c;
    public final /* synthetic */ i9k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9k(h9k h9kVar, i9k i9kVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = h9kVar;
        this.d = i9kVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        h9k h9kVar = this.c;
        i9k i9kVar = this.d;
        switch (b) {
            case 0:
                return new g9k(h9kVar, i9kVar, lnmVar, (byte) 0);
            case 1:
                return new g9k(h9kVar, i9kVar, lnmVar, (byte) 1);
            case 2:
                return new g9k(i9kVar, h9kVar, lnmVar, (byte) 2);
            case 3:
                return new g9k(h9kVar, i9kVar, lnmVar, (byte) 3);
            default:
                return new g9k(i9kVar, h9kVar, lnmVar, (byte) 4);
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
        h9k h9kVar = this.c;
        i9k i9kVar = this.d;
        d9n d9nVar = d9n.a;
        byte b2 = 1;
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
                mwm1 mwm1Var = h9kVar.e;
                zsm1 zsm1VarP = YourLibraryDecorateRequest.p();
                zsm1VarP.q(i9kVar.c);
                Observable observableC = mwm1Var.c(zsm1VarP.build());
                this.b = true;
                Object objL = fc11.l(observableC, 1, (Object) null, this);
                return objL == d9nVar ? d9nVar : objL;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Observable observableB = h9kVar.c.b(i9kVar.c, i9kVar.a);
                this.b = true;
                Object objL2 = fc11.l(observableB, 1, (Object) null, this);
                return objL2 == d9nVar ? d9nVar : objL2;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (!i9kVar.g) {
                        return uum1.a;
                    }
                    g9k g9kVar = new g9k(h9kVar, i9kVar, lnmVar, b2);
                    this.b = true;
                    obj = rc2.O(2000L, g9kVar, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return (vum1) obj;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Observable observableC2 = h9kVar.a.c(i9kVar.c);
                this.b = true;
                Object objL3 = fc11.l(observableC2, 1, (Object) null, this);
                return objL3 == d9nVar ? d9nVar : objL3;
            default:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    if (!i9kVar.f) {
                        return Boolean.FALSE;
                    }
                    g9k g9kVar2 = new g9k(h9kVar, i9kVar, lnmVar, (byte) 3);
                    this.b = true;
                    obj = rc2.O(2000L, g9kVar2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return (Boolean) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9k(i9k i9kVar, h9k h9kVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = i9kVar;
        this.c = h9kVar;
    }
}
