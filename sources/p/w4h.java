package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.esperanto.esperanto.ClientBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w4h extends ClientBase {
    public final Single a(CollectionPlatformItemsRequest collectionPlatformItemsRequest) {
        return callSingle("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "Add", collectionPlatformItemsRequest).map(fkj0.t);
    }

    public final Single b(CollectionPlatformItemsRequest collectionPlatformItemsRequest) {
        return callSingle("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "Remove", collectionPlatformItemsRequest).map(fmv.Q0);
    }

    public final Observable c(CollectionPlatformItemsRequest collectionPlatformItemsRequest) {
        return callStream("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "StreamContains", collectionPlatformItemsRequest).map(qz70.P0);
    }
}
