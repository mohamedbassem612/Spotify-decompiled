package p;

import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.search.esperanto.proto.OfflineSearchRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fwp0 extends ClientBase {
    public final Single a(OfflineSearchRequest offlineSearchRequest) {
        return callSingle("spotify.search_esperanto.proto.OfflineSearchService", "Query", offlineSearchRequest).map(zz10.T0);
    }
}
