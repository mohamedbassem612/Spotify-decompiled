package p;

import com.google.protobuf.Empty;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.offline.offlineplugin_proto.e;
import com.spotify.offline.offlineplugin_proto.f;
import com.spotify.offline.offlineplugin_proto.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jyl1 extends nup0 {
    public final rm5 a;
    public final avw0 b;
    public final ytw0 c;
    public final vpp0 d;
    public final xrc0 e;
    public final tz01 f;
    public final xaz0 g;
    public final m2l1 h;
    public final ConcurrentHashMap i;
    public final Scheduler j;
    public final idd1 k = new idd1(new bkk1(this, (byte) 18));

    public jyl1(rm5 rm5Var, avw0 avw0Var, ytw0 ytw0Var, vpp0 vpp0Var, xrc0 xrc0Var, tz01 tz01Var, xaz0 xaz0Var, m2l1 m2l1Var, ConcurrentHashMap concurrentHashMap, Scheduler scheduler) {
        this.a = rm5Var;
        this.b = avw0Var;
        this.c = ytw0Var;
        this.d = vpp0Var;
        this.e = xrc0Var;
        this.f = tz01Var;
        this.g = xaz0Var;
        this.h = m2l1Var;
        this.i = concurrentHashMap;
        this.j = scheduler;
    }

    public final Observable a(EsOfflinePlugin.DownloadCommand downloadCommand) {
        Single singleF = rqt0.F((q8n) this.k.getValue(), new gqj1(downloadCommand, this, (lnm) null, (byte) 21));
        kpz kpzVarN = EsOfflinePlugin.DownloadResponse.n();
        kpzVarN.u(downloadCommand.getLink());
        kpzVarN.q();
        kpzVarN.r(lpz.c);
        return singleF.onErrorReturnItem(kpzVarN.build()).toObservable();
    }

    public final Single b(EsOfflinePlugin.IdentifyCommand identifyCommand) {
        Single singleF = rqt0.F((q8n) this.k.getValue(), new gqj1(identifyCommand, this, (lnm) null, (byte) 22));
        e eVarO = EsOfflinePlugin.IdentifyResponse.o();
        Iterator it = identifyCommand.n().iterator();
        while (it.hasNext()) {
            String link = ((EsOfflinePlugin.IdentifyCommand.Query) it.next()).getLink();
            f fVarO = EsOfflinePlugin.IdentifyResponse.Result.o();
            fVarO.q(g.d);
            eVarO.n(link, fVarO.build());
        }
        return singleF.onErrorReturnItem(eVarO.build());
    }

    public final Single c(EsOfflinePlugin.RemoveCommand removeCommand) {
        return rqt0.F((q8n) this.k.getValue(), new t6j1(removeCommand, this, (lnm) null, (byte) 25)).onErrorReturnItem(Empty.n());
    }

    public final Single d() {
        return Single.just(Empty.n());
    }
}
