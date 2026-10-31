package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w5d extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public ayh b;
    public boolean c;
    public final /* synthetic */ ayh d;
    public final /* synthetic */ hj31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5d(ayh ayhVar, hj31 hj31Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = ayhVar;
        this.e = hj31Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hj31 hj31Var = this.e;
        ayh ayhVar = this.d;
        switch (b) {
            case 0:
                return new w5d(ayhVar, hj31Var, lnmVar, (byte) 0);
            default:
                return new w5d(ayhVar, hj31Var, lnmVar, (byte) 1);
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
        ayh ayhVar;
        ayh ayhVar2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hj31 hj31Var = this.e;
        d9n d9nVar = d9n.a;
        ayh ayhVar3 = this.d;
        switch (b) {
            case 0:
                boolean z = this.c;
                try {
                    if (!z) {
                        hm5.M(obj);
                        this.b = ayhVar3;
                        this.c = true;
                        obj = hj31Var.a(false, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                        ayhVar = ayhVar3;
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ayhVar = this.b;
                        hm5.M(obj);
                    }
                    ayhVar.m0(obj);
                    return rih1Var;
                } catch (CancellationException e) {
                    ayhVar3.S(e);
                    throw e;
                } catch (Throwable th) {
                    ayhVar3.m0(Boolean.FALSE);
                    Logger.e(th, "Rive initialization failed", new Object[0]);
                    return rih1Var;
                }
            default:
                boolean z2 = this.c;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        this.b = ayhVar3;
                        this.c = true;
                        obj = hj31Var.a(false, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                        ayhVar2 = ayhVar3;
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ayhVar2 = this.b;
                        hm5.M(obj);
                    }
                    ayhVar2.m0(obj);
                    return rih1Var;
                } catch (CancellationException e2) {
                    ayhVar3.S(e2);
                    throw e2;
                } catch (Throwable th2) {
                    ayhVar3.m0(Boolean.FALSE);
                    Logger.e(th2, "Rive initialization failed", new Object[0]);
                    return rih1Var;
                }
        }
    }
}
