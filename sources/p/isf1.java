package p;

import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackSyncDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionAlbumDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionTrackDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class isf1 implements hsf1 {
    public static final CollectionTrackDecorationPolicy b;
    public final r5h a;

    static {
        AlbumDecorationPolicy albumDecorationPolicyBuild = AlbumDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true).build();
        ArtistDecorationPolicy artistDecorationPolicyBuild = ArtistDecorationPolicy.newBuilder().setLink(true).setName(true).setPortraits(true).build();
        TrackDecorationPolicy trackDecorationPolicyBuild = TrackDecorationPolicy.newBuilder().setLink(true).setName(true).setIsLocal(true).setIsCurated(true).setTrackDescriptors(true).build();
        TrackCollectionDecorationPolicy trackCollectionDecorationPolicyBuild = TrackCollectionDecorationPolicy.newBuilder().setIsInCollection(true).setCanAddToCollection(true).setIsBanned(true).setCanBan(true).build();
        TrackPlayedStateDecorationPolicy trackPlayedStateDecorationPolicyBuild = TrackPlayedStateDecorationPolicy.newBuilder().setPlayable(true).setIsCurrentlyPlayable(true).setPlayabilityRestriction(true).build();
        TrackSyncDecorationPolicy trackSyncDecorationPolicyBuild = TrackSyncDecorationPolicy.newBuilder().setOfflineState(true).setSyncProgress(true).build();
        e0h e0hVarO = CollectionAlbumDecorationPolicy.o();
        e0hVarO.n(albumDecorationPolicyBuild);
        CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicyBuild = e0hVarO.build();
        k7h k7hVarN = CollectionTrackDecorationPolicy.n();
        k7hVarN.u(trackCollectionDecorationPolicyBuild);
        k7hVarN.w(trackPlayedStateDecorationPolicyBuild);
        k7hVarN.x(trackSyncDecorationPolicyBuild);
        k7hVarN.z(trackDecorationPolicyBuild);
        k7hVarN.n(collectionAlbumDecorationPolicyBuild);
        k7hVarN.s(artistDecorationPolicyBuild);
        b = k7hVarN.build();
    }

    public isf1(r5h r5hVar) {
        this.a = r5hVar;
    }
}
