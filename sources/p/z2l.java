package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z2l extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2l(iu30 iu30Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = iu30Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                return new z2l(iu30Var, str, lnmVar, (byte) 0);
            case 1:
                z2l z2lVar = new z2l(iu30Var, str, lnmVar, (byte) 1);
                z2lVar.b = ((Boolean) obj).booleanValue();
                return z2lVar;
            default:
                return new z2l(iu30Var, str, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((z2l) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((z2l) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return ((z2l) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.a;
        String str = this.d;
        rih1 rih1Var = rih1.a;
        rih1 rih1Var2 = d9n.a;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        this.b = true;
                        obj = iu30Var.invoke(this);
                        if (obj == rih1Var2) {
                            obj = rih1Var2;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return obj;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Logger.e(e2, f4i1.f(str, ": ", e2.getMessage()), new Object[0]);
                    throw e2;
                }
            case 1:
                boolean z2 = this.b;
                hm5.M(obj);
                iu30Var.invoke(new kdn(z2, str));
                return rih1Var;
            default:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        this.b = true;
                        if (iu30Var.invoke(this) == rih1Var2) {
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
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable unused) {
                    return rih1Var;
                }
        }
    }
}
