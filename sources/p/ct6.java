package p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ct6 implements o5s {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ct6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onStop(iac0 iac0Var) {
        switch (this.a) {
            case 0:
                ((dt6) this.b).e();
                break;
            case 1:
                ((lxg) this.b).b("user_backgrounded");
                break;
            case 2:
                r1m r1mVar = (r1m) this.b;
                xab1 xab1Var = r1mVar.d;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                r1mVar.d = null;
                r091 r091Var = r1mVar.c;
                if (r091Var != null) {
                    r091Var.g();
                }
                r1mVar.c = null;
                zau0 zau0Var = r1mVar.e;
                if (zau0Var != null) {
                    r1mVar.a.b(zau0Var);
                }
                r1mVar.e = null;
                r1mVar.f.l((Object) null);
                r1mVar.h.l((Object) null);
                break;
            case 3:
                ((rzq) this.b).l();
                iac0Var.getLifecycle().d(this);
                break;
            case 4:
                y5v0 y5v0Var = ((mar) this.b).d;
                y5v0Var.k.g();
                ((a6v0) y5v0Var.a.get()).b();
                break;
            case 5:
                gdr gdrVar = (gdr) this.b;
                d4e d4eVar = new d4e(gdrVar, (byte) 12);
                ReentrantLock reentrantLock = gdrVar.b;
                reentrantLock.lock();
                d4eVar.invoke();
                reentrantLock.unlock();
                break;
            case 6:
                p68 p68Var = (p68) this.b;
                ((CompositeDisposable) p68Var.f).g();
                p68Var.a();
                break;
            case 7:
                ((i160) this.b).m.c();
                break;
            case 8:
                y5v0 y5v0Var2 = (y5v0) ((mre0) this.b).b;
                y5v0Var2.k.g();
                ((a6v0) y5v0Var2.a.get()).b();
                break;
            case 9:
                ((Disposable) this.b).dispose();
                iac0Var.getLifecycle().d(this);
                break;
            case 10:
                p410 p410Var = (p410) this.b;
                p410Var.D();
                zau0 zau0Var2 = (zau0) p410Var.d;
                if (zau0Var2 != null) {
                    ((ttm0) ((ynb0) p410Var.b).get()).b(zau0Var2);
                }
                p410Var.d = null;
                break;
            case 11:
                ((byp) this.b).i(tnt0.e);
                break;
            case 12:
                c751 c751Var = (c751) this.b;
                c751Var.Y.a(c751Var.V0);
                break;
            case 13:
                uu0 uu0Var = (uu0) this.b;
                if (!uu0Var.a) {
                    uu0Var.n("failure", "cancelled");
                } else {
                    uu0Var.n("failure", "all-rows-failed");
                }
                break;
            default:
                ((tuh1) this.b).b.c();
                break;
        }
    }
}
