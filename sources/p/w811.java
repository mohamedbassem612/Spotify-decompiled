package p;

import com.google.protobuf.Empty;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$DownloadCommand;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$DownloadResponse;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyCommand;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyResponse;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$RemoveCommand;
import com.spotify.offline.offlineplugin_proto.e;
import com.spotify.offline.offlineplugin_proto.f;
import com.spotify.offline.offlineplugin_proto.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w811 extends nup0 {
    public final LinkedHashSet a = new LinkedHashSet();

    public final Observable a(EsOfflinePlugin$DownloadCommand esOfflinePlugin$DownloadCommand) {
        this.a.add(esOfflinePlugin$DownloadCommand.getLink());
        kpz kpzVarN = EsOfflinePlugin$DownloadResponse.n();
        kpzVarN.u(esOfflinePlugin$DownloadCommand.getLink());
        kpzVarN.q();
        kpzVarN.t(10L);
        kpzVarN.n(10L);
        kpzVarN.r(lpz.OK);
        return Observable.just(kpzVarN.build());
    }

    public final Single b(EsOfflinePlugin$IdentifyCommand esOfflinePlugin$IdentifyCommand) {
        e eVarO = EsOfflinePlugin$IdentifyResponse.o();
        for (EsOfflinePlugin$IdentifyCommand.Query query : esOfflinePlugin$IdentifyCommand.n()) {
            f fVarO = EsOfflinePlugin$IdentifyResponse.Result.o();
            fVarO.q(this.a.contains(query.getLink()) ? g.c : g.b);
            fVarO.n();
            eVarO.n(query.getLink(), (EsOfflinePlugin$IdentifyResponse.Result) fVarO.build());
        }
        return Single.just(eVarO.build());
    }

    public final Single c(EsOfflinePlugin$RemoveCommand esOfflinePlugin$RemoveCommand) {
        Iterator it = esOfflinePlugin$RemoveCommand.n().iterator();
        while (it.hasNext()) {
            this.a.remove(((EsOfflinePlugin$RemoveCommand.Query) it.next()).getLink());
        }
        return Single.just(Empty.n());
    }

    public final Single d() {
        return Single.just(Empty.n());
    }
}
