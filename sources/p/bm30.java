package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bm30 implements iyf0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ bm30(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void c() {
        switch (this.a) {
            case 0:
                dxy dxyVar = (dxy) this.b;
                ((rku) dxyVar.f).b(((o241) dxyVar.c).a.map(new c9c(dxyVar, (byte) 11)).distinctUntilChanged().switchMapSingle(new bm00(dxyVar, (byte) 7)).doOnNext(new od30(dxyVar, (byte) 2)).onErrorReturnItem(new gru(3, false)).subscribeOn((Scheduler) dxyVar.e).subscribe(p.R0, k530.e));
                break;
        }
    }

    public final void d() {
        switch (this.a) {
            case 0:
                ((rku) ((dxy) this.b).f).a();
                break;
        }
    }

    public final void g(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                break;
            default:
                pus pusVar = (pus) ((ynb0) this.b).get();
                ((f0i) pusVar.a().a).a.a(pusVar);
                break;
        }
    }

    private final void b() {
    }

    private final void e() {
    }

    private final void a(ViewGroup viewGroup) {
    }
}
