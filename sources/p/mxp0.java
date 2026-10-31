package p;

import com.google.protobuf.Empty;
import com.spotify.offline_esperanto.proto.EsOffline;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mxp0 {
    public final vpp0 a;
    public final ps7 b;
    public Disposable c;

    public mxp0(vpp0 vpp0Var, ps7 ps7Var) {
        this.a = vpp0Var;
        this.b = ps7Var;
    }

    public final void a(nso0 nso0Var, gpc gpcVar, exp0 exp0Var) {
        Observable map;
        boolean zA = ((t7f0) this.b.b).a();
        exp0Var.b("subscribe bulk_enabled=" + zA + " seeded_idle=true");
        Empty emptyN = Empty.n();
        vpp0 vpp0Var = this.a;
        Observable observableStartWithItem = vpp0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeTotalProgress", emptyN).map(dj20.S0).map(new swm0(exp0Var, (byte) 14)).startWithItem(EsOffline.Progress.o());
        if (zA) {
            map = Observable.combineLatest(observableStartWithItem, vpp0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeBulkRedownloadProgress", Empty.n()).map(rh20.T0).startWithItem(EsOffline.Progress.o()), new yrg0(exp0Var, (byte) 3));
            map.getClass();
        } else {
            map = observableStartWithItem.map(new d4e0(exp0Var, (byte) 29));
            map.getClass();
        }
        this.c = map.distinctUntilChanged().sample(250L, TimeUnit.MILLISECONDS, true).subscribe(new qg7(nso0Var, exp0Var, gpcVar, (byte) 18));
    }

    public final void b() {
        Disposable disposable = this.c;
        if (disposable != null) {
            if (disposable.isDisposed()) {
                disposable = null;
            }
            if (disposable != null) {
                disposable.dispose();
            }
        }
    }
}
