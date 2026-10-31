package p;

import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.metadata.esperanto.proto.GetEntityRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ueg extends ClientBase {
    public final Single a(GetEntityRequest getEntityRequest) {
        return callSingle("spotify.metadata_esperanto.proto.ClassicMetadataService", "GetEntity", getEntityRequest).map(m9h.Q0);
    }
}
