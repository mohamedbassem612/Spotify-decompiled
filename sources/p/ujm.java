package p;

import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.player.esperanto.proto.EsSetOptions;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ujm extends ClientBase {
    public final Single a(EsSetOptions.SetOptionsRequest setOptionsRequest) {
        return callSingle("spotify.player.esperanto.proto.ContextPlayer", "SetOptions", setOptionsRequest).map(qbo1.R0);
    }
}
