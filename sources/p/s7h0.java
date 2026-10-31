package p;

import io.reactivex.rxjava3.core.Completable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s7h0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y7h0 d;
    public final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7h0(y7h0 y7h0Var, List list, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = y7h0Var;
        this.e = list;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        List list = this.e;
        y7h0 y7h0Var = this.d;
        switch (b) {
            case 0:
                s7h0 s7h0Var = new s7h0(y7h0Var, list, lnmVar, (byte) 0);
                s7h0Var.c = obj;
                return s7h0Var;
            case 1:
                s7h0 s7h0Var2 = new s7h0(y7h0Var, list, lnmVar, (byte) 1);
                s7h0Var2.c = obj;
                return s7h0Var2;
            case 2:
                s7h0 s7h0Var3 = new s7h0(y7h0Var, list, lnmVar, (byte) 2);
                s7h0Var3.c = obj;
                return s7h0Var3;
            default:
                s7h0 s7h0Var4 = new s7h0(y7h0Var, list, lnmVar, (byte) 3);
                s7h0Var4.c = obj;
                return s7h0Var4;
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
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        List list = this.e;
        y7h0 y7h0Var = this.d;
        rih1 rih1Var2 = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        Completable completableA = y7h0Var.b.a(mdz.class, list);
                        this.c = null;
                        this.b = true;
                        if (fc11.i(completableA, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (Throwable unused) {
                    return rih1Var;
                }
            case 1:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        Completable completableA2 = y7h0Var.b.a(jo70.class, list);
                        this.c = null;
                        this.b = true;
                        if (fc11.i(completableA2, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (Throwable unused2) {
                    return rih1Var;
                }
            case 2:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        Completable completableA3 = y7h0Var.b.a(xkk1.class, list);
                        this.c = null;
                        this.b = true;
                        if (fc11.i(completableA3, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (Throwable unused3) {
                    return rih1Var;
                }
            default:
                boolean z4 = this.b;
                try {
                    if (!z4) {
                        hm5.M(obj);
                        Completable completableA4 = y7h0Var.b.a(hll.class, list);
                        this.c = null;
                        this.b = true;
                        if (fc11.i(completableA4, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (Throwable unused4) {
                    return rih1Var;
                }
        }
    }
}
