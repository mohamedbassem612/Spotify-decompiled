package p;

import com.spotify.esperanto.esperanto.ClientBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionGetArtistViewRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r5h extends ClientBase {
    public final Single a(CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest) {
        return callSingle("spotify.collection_esperanto.proto.CollectionService", "Add", collectionAddRemoveItemsRequest).map(wdu0.i);
    }

    public final Single b(CollectionDecorateRequest collectionDecorateRequest) {
        return callSingle("spotify.collection_esperanto.proto.CollectionService", "Decorate", collectionDecorateRequest).map(qbo1.O0);
    }

    public final Single c(CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest) {
        return callSingle("spotify.collection_esperanto.proto.CollectionService", "Remove", collectionAddRemoveItemsRequest).map(vap1.P0);
    }

    public final Observable d(CollectionGetArtistViewRequest collectionGetArtistViewRequest) {
        return callStream("spotify.collection_esperanto.proto.CollectionService", "StreamArtistView", collectionGetArtistViewRequest).map(vgp1.P0);
    }

    public final Observable e(CollectionDecorateRequest collectionDecorateRequest) {
        return callStream("spotify.collection_esperanto.proto.CollectionService", "StreamDecorate", collectionDecorateRequest).map(rbc.R0);
    }
}
