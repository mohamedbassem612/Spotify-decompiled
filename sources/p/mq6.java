package p;

import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import spotify.collection.esperanto.proto.CollectionArtistDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionGetArtistViewRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mq6 implements lq6 {
    public final r5h a;
    public final CollectionArtistDecorationPolicy b;

    public mq6(r5h r5hVar) {
        this.a = r5hVar;
        ArtistDecorationPolicy artistDecorationPolicyBuild = ArtistDecorationPolicy.newBuilder().setName(true).setLink(true).setPortraits(true).build();
        ArtistCollectionDecorationPolicy artistCollectionDecorationPolicyBuild = ArtistCollectionDecorationPolicy.newBuilder().setCollectionLink(true).setNumExplicitlyLikedTracks(true).setNumAlbumsInCollection(true).setCollectionLink(true).build();
        ArtistSyncDecorationPolicy artistSyncDecorationPolicy = (ArtistSyncDecorationPolicy) ArtistSyncDecorationPolicy.newBuilder().setOfflineState(true).build();
        l0h l0hVarO = CollectionArtistDecorationPolicy.o();
        l0hVarO.n(artistDecorationPolicyBuild);
        l0hVarO.q(artistCollectionDecorationPolicyBuild);
        l0hVarO.r(artistSyncDecorationPolicy);
        this.b = l0hVarO.build();
    }

    public final Observable a(String str) {
        b4h b4hVarN = CollectionGetArtistViewRequest.n();
        b4hVarN.r(str);
        b4hVarN.q(this.b);
        CollectionGetArtistViewRequest collectionGetArtistViewRequestBuild = b4hVarN.build();
        collectionGetArtistViewRequestBuild.getClass();
        return this.a.d(collectionGetArtistViewRequestBuild).map(new bjx0(this));
    }
}
