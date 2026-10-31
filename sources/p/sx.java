package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sx extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ zsc c;
    public final /* synthetic */ voa0 d;
    public final /* synthetic */ hj8 e;
    public final /* synthetic */ kd8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx(zsc zscVar, voa0 voa0Var, hj8 hj8Var, kd8 kd8Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = zscVar;
        this.d = voa0Var;
        this.e = hj8Var;
        this.f = kd8Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new sx(this.c, this.d, this.e, this.f, lnmVar, (byte) 0);
            default:
                return new sx(this.c, this.d, this.e, this.f, lnmVar, (byte) 1);
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
        hj8 hj8Var = this.e;
        kd8 kd8Var = this.f;
        zsc zscVar = this.c;
        rih1 rih1Var2 = d9n.a;
        voa0 voa0Var = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        mr20 mr20VarK = zscVar.k(voa0Var.a);
                        rx rxVar = new rx(kd8Var, (byte) 0);
                        this.b = true;
                        if (mr20VarK.collect(rxVar, this) == rih1Var2) {
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
                } catch (Throwable th) {
                    hj8Var.invoke(voa0Var.a, th);
                    return rih1Var;
                }
            default:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        mr20 mr20VarK2 = zscVar.k(voa0Var.d);
                        rx rxVar2 = new rx(kd8Var, (byte) 2);
                        this.b = true;
                        if (mr20VarK2.collect(rxVar2, this) == rih1Var2) {
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
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    hj8Var.invoke(voa0Var.d, th2);
                    return rih1Var;
                }
        }
    }
}
