package p;

import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.c;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c2n0 implements dwo {
    public final /* synthetic */ byte a = 1;
    public final rku b;

    public c2n0(a820 a820Var, byp0 byp0Var, y7c0 y7c0Var) {
        rku rkuVar = new rku();
        this.b = rkuVar;
        vpp0 vpp0Var = byp0Var.a;
        c cVarQ = EsOffline.GetContextsRequest.q();
        qoz qozVarN = EsOffline.ContextInfoPolicy.n();
        qozVarN.n(false);
        cVarQ.t(qozVarN);
        rkuVar.b(Observable.combineLatest(vpp0Var.c(cVarQ.build()).map(zi20.R0).map(new mhc(this, (byte) 26)).distinctUntilChanged(), (Observable) ((idd1) y7c0Var.f).getValue(), xpv0.i).distinctUntilChanged().onErrorReturn(w1x0.W0).subscribe(new dy40(a820Var, (byte) 27)));
    }

    public final void shutdown() {
        byte b = this.a;
        rku rkuVar = this.b;
        switch (b) {
            case 0:
                rkuVar.a();
                break;
            default:
                rkuVar.a();
                break;
        }
    }

    public c2n0(o241 o241Var, Scheduler scheduler, u3c u3cVar) {
        rku rkuVar = new rku();
        this.b = rkuVar;
        rkuVar.b(((p241) o241Var).a.map(fj10.P0).observeOn(scheduler).doOnNext(new lrj0(u3cVar, (byte) 8)).subscribe());
    }
}
