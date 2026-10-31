package p;

import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((o6) obj).b();
                return;
            case 1:
                pa4 pa4Var = (pa4) obj;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    pa4Var.a.t(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        pa4Var.e();
                        Trace.endSection();
                        pa4Var.f1 = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                ((g0i) obj).invalidateOptionsMenu();
                return;
            case 3:
                ((CompletableObserver) obj).onComplete();
                return;
            case 4:
                ((Observer) obj).onComplete();
                return;
            case 5:
                ln10 ln10Var = (ln10) obj;
                ln10Var.a.i(mn10.b(ln10Var.b));
                return;
            case 6:
                ((lj20) obj).a();
                return;
            case 7:
                zf30 zf30Var = (zf30) obj;
                lj30 lj30Var = zf30Var.u1;
                lj30Var.f.n(zf30Var.d);
                zf30Var.d = null;
                return;
            case 8:
                cdf0 cdf0Var = (cdf0) obj;
                Semaphore semaphore = cdf0Var.k1;
                i4k i4kVar = cdf0Var.O0;
                if (i4kVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    i4kVar.r(cdf0Var.b.j());
                    if (cdf0.q1 && cdf0Var.i1) {
                        Handler handler = cdf0Var.l1;
                        if (handler == null) {
                            handler = new Handler(Looper.getMainLooper());
                            cdf0Var.l1 = handler;
                            cdf0Var.m1 = new gv40(cdf0Var, (byte) 13);
                        }
                        handler.post(cdf0Var.m1);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
            case 9:
                krw0 krw0Var = (krw0) obj;
                tac0 tac0Var = krw0Var.f;
                if (krw0Var.b == 0) {
                    krw0Var.c = true;
                    tac0Var.g(k8c0.ON_PAUSE);
                }
                if (krw0Var.a == 0 && krw0Var.c) {
                    tac0Var.g(k8c0.ON_STOP);
                    krw0Var.d = true;
                    return;
                }
                return;
            default:
                ((Disposable) obj).dispose();
                return;
        }
    }
}
