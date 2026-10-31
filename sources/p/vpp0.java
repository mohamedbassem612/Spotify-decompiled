package p;

import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vpp0 extends ClientBase {
    public final Single a(EsOffline.DownloadRequest downloadRequest) {
        return callSingle("spotify.offline_esperanto.proto.Offline", "AddDownload", downloadRequest).map(ok10.R0);
    }

    public final Single b(EsOffline$GetContextsRequest esOffline$GetContextsRequest) {
        return callSingle("spotify.offline_esperanto.proto.Offline", "GetContexts", esOffline$GetContextsRequest).map(yz10.S0);
    }

    public final Observable c(EsOffline$GetContextsRequest esOffline$GetContextsRequest) {
        return callStream("spotify.offline_esperanto.proto.Offline", "SubscribeContexts", esOffline$GetContextsRequest).map(xi20.U0);
    }
}
