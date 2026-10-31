package p;

import com.spotify.esperanto.esperanto.ClientBase;
import io.reactivex.rxjava3.core.Observable;
import spotify.autodownload.esperanto.proto.EnabledShowsCountRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mt8 extends ClientBase {
    public final Observable a(EnabledShowsCountRequest enabledShowsCountRequest) {
        return callStream("spotify.autodownload_esperanto.proto.AutoDownloadService", "StreamEnabledShowsCount", enabledShowsCountRequest).map(fmv.t);
    }
}
