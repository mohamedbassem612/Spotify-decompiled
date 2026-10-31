package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nxk1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ cik1 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxk1(cik1 cik1Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = cik1Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        cik1 cik1Var = this.c;
        switch (b) {
            case 0:
                return new nxk1(cik1Var, str, lnmVar, (byte) 0);
            default:
                return new nxk1(cik1Var, str, lnmVar, (byte) 1);
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
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        cik1 cik1Var = this.c;
        rih1 rih1Var2 = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        CompletableCreate completableCreateO = ((gw70) cik1Var.e).f(str).o();
                        this.b = true;
                        if (fc11.i(completableCreateO, this) == rih1Var2) {
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
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Logger.e(e2, l1d.m("Error prefetching share card image: ", str), new Object[0]);
                    return rih1Var;
                }
            default:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        xyc0 xyc0Var = (iyc0) cik1Var.c;
                        ddd1 ddd1Var = ddd1.Z;
                        this.b = true;
                        obj = xyc0Var.u(str, ddd1Var, this);
                        if (obj == rih1Var2) {
                            obj = rih1Var2;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return obj;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    Logger.e(e4, "Error re syncing playlist", new Object[0]);
                    return rih1Var;
                }
        }
    }
}
