package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class flp0 implements a4l {
    public final kly0 a;
    public final xcs b;
    public final Scheduler c;
    public final apr d;
    public final rku e = new rku();

    public flp0(kly0 kly0Var, xcs xcsVar, Scheduler scheduler, apr aprVar) {
        this.a = kly0Var;
        this.b = xcsVar;
        this.c = scheduler;
        this.d = aprVar;
    }

    @Override // p.a4l
    public final void a() {
        if (((p3l) this.b.a.get()).E()) {
            this.e.a();
        }
    }

    @Override // p.a4l
    public final void b() {
        if (!((p3l) this.b.a.get()).E() || this.d.c()) {
            return;
        }
        wkp0 wkp0Var = (wkp0) this.a.get();
        wkp0Var.getClass();
        Observable observableNever = Observable.never();
        MobiusLoop.Builder builderG = l1d.g(Mobius.d(vkp0.a, RxConnectables.a(kkp0.a(wkp0Var.e, wkp0Var.f, wkp0Var.g))).h(v9p1.M(wkp0Var.a, wkp0Var.b, wkp0Var.c, wkp0Var.d, new ObservableFromPublisher(wkp0Var.i.j(mo9.N0)), wkp0Var.j)));
        boolean zF = ((p3l) wkp0Var.h.a.get()).F();
        z6x z6xVar = z6x.a;
        gbl gblVar = gbl.e;
        this.e.b(observableNever.compose(RxMobius.b(builderG, new alp0(z6xVar, null, null, gblVar, gblVar, false, null, null, zF, false))).distinctUntilChanged().observeOn(this.c).subscribe());
    }
}
