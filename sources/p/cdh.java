package p;

import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cdh extends gn21 {
    public final Scheduler a;
    public final och b;
    public final nt21 c;
    public final Observable d;

    public cdh(w8v0 w8v0Var, rfs rfsVar, String str, t881 t881Var, e481 e481Var, boolean z, ydq ydqVar, Scheduler scheduler, o241 o241Var, fuw0 fuw0Var, RxRouter rxRouter) {
        this.a = scheduler;
        teq teqVar = ydqVar.a.d;
        och ochVar = new och(w8v0Var, rfsVar, str, t881Var, e481Var, (zdq) teqVar.c3.get(), (ceq) teqVar.d3.get(), new v9c((byte) 6));
        this.b = ochVar;
        y48 y48Var = new y48(new CosmosTransport(new sn0(rxRouter, (byte) 10)));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new nt21(y48Var, yon1.j5(), (byte) 2);
        this.d = Observable.combineLatest(ochVar.switchMap(new lls0(z, this, (byte) 14)), ((p241) o241Var).a.map(mm10.W0), fuw0Var.a.distinctUntilChanged(), ns80.T0).distinctUntilChanged().distinctUntilChanged();
    }

    public final Observable a() {
        return this.d;
    }

    public final void accept(Object obj) {
        this.b.accept((w8v0) obj);
    }
}
