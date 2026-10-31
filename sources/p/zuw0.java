package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zuw0 implements f961 {
    public final kly0 a;
    public final kly0 b;

    public zuw0(kly0 kly0Var, kly0 kly0Var2) {
        this.a = kly0Var;
        this.b = kly0Var2;
    }

    public final lt20 a() {
        return new lt20(rqt0.u(new c1v0(((ov20) this.a.get()).c("campfire-played-receipts", "1"), (byte) 17)), new w1e0(3, (lnm) null, (byte) 17), (byte) 0);
    }

    public final lt20 b() {
        return new lt20(rqt0.u(new c1v0(((ov20) this.a.get()).c("campfire-saved-receipts", "1"), (byte) 18)), new w1e0(3, (lnm) null, (byte) 18), (byte) 0);
    }

    public final lt20 c() {
        return new lt20(rqt0.u(new c1v0(((ov20) this.a.get()).c("campfire-seen-receipts", "1"), (byte) 19)), new w1e0(3, (lnm) null, (byte) 19), (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(boolean z, onm onmVar) {
        wuw0 wuw0Var;
        if (onmVar instanceof wuw0) {
            wuw0Var = (wuw0) onmVar;
            int i = wuw0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wuw0Var.c = i - Integer.MIN_VALUE;
            } else {
                wuw0Var = new wuw0(this, onmVar);
            }
        } else {
            wuw0Var = new wuw0(this, onmVar);
        }
        Object obj = wuw0Var.a;
        int i2 = wuw0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableB = ((r241) this.b.get()).b("campfire-played-receipts", z ? "1" : "0");
                wuw0Var.c = 1;
                Object objI = fc11.i(completableB, wuw0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to update played receipts product state", new Object[0]);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(boolean z, onm onmVar) {
        xuw0 xuw0Var;
        if (onmVar instanceof xuw0) {
            xuw0Var = (xuw0) onmVar;
            int i = xuw0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xuw0Var.c = i - Integer.MIN_VALUE;
            } else {
                xuw0Var = new xuw0(this, onmVar);
            }
        } else {
            xuw0Var = new xuw0(this, onmVar);
        }
        Object obj = xuw0Var.a;
        int i2 = xuw0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableB = ((r241) this.b.get()).b("campfire-saved-receipts", z ? "1" : "0");
                xuw0Var.c = 1;
                Object objI = fc11.i(completableB, xuw0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to update saved receipts product state", new Object[0]);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(boolean z, onm onmVar) {
        yuw0 yuw0Var;
        if (onmVar instanceof yuw0) {
            yuw0Var = (yuw0) onmVar;
            int i = yuw0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yuw0Var.c = i - Integer.MIN_VALUE;
            } else {
                yuw0Var = new yuw0(this, onmVar);
            }
        } else {
            yuw0Var = new yuw0(this, onmVar);
        }
        Object obj = yuw0Var.a;
        int i2 = yuw0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableB = ((r241) this.b.get()).b("campfire-seen-receipts", z ? "1" : "0");
                yuw0Var.c = 1;
                Object objI = fc11.i(completableB, yuw0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to update seen receipts product state", new Object[0]);
        }
        return rih1.a;
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
