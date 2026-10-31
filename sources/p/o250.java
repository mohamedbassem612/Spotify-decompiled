package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o250 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ p250 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o250(p250 p250Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = p250Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        p250 p250Var = this.c;
        switch (b) {
            case 0:
                return new o250(p250Var, lnmVar, (byte) 0);
            case 1:
                return new o250(p250Var, lnmVar, (byte) 1);
            case 2:
                return new o250(p250Var, lnmVar, (byte) 2);
            default:
                return new o250(p250Var, lnmVar, (byte) 3);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objD;
        Object objB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        p250 p250Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    ay40 ay40Var = p250Var.b;
                    this.b = true;
                    objA = ay40Var.a(this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = ((e331) obj).a;
                }
                Throwable thA = e331.a(objA);
                if (thA == null) {
                    return rih1Var;
                }
                Logger.d(l1d.m("DevicePredictability: Google GMS registration failed ", thA.getMessage()), new Object[0]);
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    p250Var.d(this);
                    return d9nVar;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    ay40 ay40Var2 = p250Var.b;
                    this.b = true;
                    objD = ay40Var2.d(this);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objD = ((e331) obj).a;
                }
                Throwable thA2 = e331.a(objD);
                if (thA2 == null) {
                    return rih1Var;
                }
                Logger.d(l1d.m("DevicePredictability: Google GMS unregistering callback failed ", thA2.getMessage()), new Object[0]);
                return rih1Var;
            default:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    p250Var.a.getClass();
                    ay40 ay40Var3 = p250Var.b;
                    this.b = true;
                    objB = ay40Var3.b(this);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = ((e331) obj).a;
                }
                if (objB instanceof m231) {
                    return rih1Var;
                }
                return rih1Var;
        }
    }
}
