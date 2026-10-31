package p;

import com.spotify.esperanto.esperanto.ClientBase;
import io.reactivex.rxjava3.core.Single;
import spotify.mdata.proto.Mdata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zmj0 extends ClientBase {
    public final Single a(Mdata.LocalBatchedEntityRequest localBatchedEntityRequest) {
        return callSingle("spotify.mdata_esperanto.proto.MetadataService", "Fetch", localBatchedEntityRequest).map(fkj0.Z0);
    }
}
