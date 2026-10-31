package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateRequest;
import com.spotify.connectivity.esperanto.proto.SubStateRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bfs implements a4l {
    public final Flowable a;
    public final y2l b;
    public final ecl c;
    public final q8n d;

    static {
        new ypa((byte) 7, false);
    }

    public bfs(Flowable flowable, y2l y2lVar, ecl eclVar, q8n q8nVar) {
        this.a = flowable;
        this.b = y2lVar;
        this.c = eclVar;
        this.d = q8nVar;
    }

    public final Observable c() {
        ObservableFromPublisher observableFromPublisher = new ObservableFromPublisher(this.a.j(mo9.N0));
        SubStateRequest subStateRequest = (SubStateRequest) SubStateRequest.n().build();
        be beVar = this.c.a;
        subStateRequest.getClass();
        return Observable.combineLatest(observableFromPublisher, yoi1.i(new wef(yoi1.g(beVar.s(subStateRequest)), (byte) 13), o6x.a).map(zhm0.U0), d(), qz70.W0).skipWhile(b6j0.V0).distinctUntilChanged();
    }

    public final Observable d() {
        c3l c3lVar = (c3l) this.b;
        c3lVar.getClass();
        u4l u4lVarN = ConnectMessages$StateRequest.n();
        u4lVarN.q();
        u4lVarN.n(false);
        u4lVarN.s(true);
        u4lVarN.t(true);
        u4lVarN.r(false);
        ConnectMessages$StateRequest connectMessages$StateRequest = (ConnectMessages$StateRequest) u4lVarN.build();
        connectMessages$StateRequest.getClass();
        return yoi1.i(c3lVar.c(connectMessages$StateRequest), this.d).map(new mta((byte) 7));
    }
}
