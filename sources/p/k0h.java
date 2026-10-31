package p;

import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemMetadataPolicy;
import com.spotify.playlist.policy.proto.ItemOfflineStateDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.Collections;
import java.util.List;
import spotify.collection.esperanto.proto.CollectionAlbumDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionArtistDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k0h {
    public static final trc0 f;
    public static final CollectionArtistDecorationPolicy g;
    public static final CollectionAlbumDecorationPolicy h;
    public final ynb0 a;
    public final iyc0 b;
    public final r5h c;
    public final s4b1 d;
    public final String e;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.A();
        nl90 nl90VarO = ItemMetadataPolicy.o();
        nl90VarO.r(true);
        nl90VarO.q(true);
        iou0VarV.w(nl90VarO);
        ol90 ol90VarO = ItemOfflineStateDecorationPolicy.o();
        ol90VarO.q(true);
        iou0VarV.y(ol90VarO.build());
        hru0VarS.v(iou0VarV);
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.A();
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true).setName(true).setPlayable(true).setIsExplicit(true).setIs19PlusOnly(true));
        dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
        dgu0VarP.n(AlbumDecorationPolicy.newBuilder().setCovers(true).setName(true));
        vwu0VarR.s(dgu0VarP);
        hru0VarS.z(vwu0VarR);
        f = new trc0(hru0VarS.build(), (g3d0) null, Collections.singleton(wqc0.a), false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 474);
        l0h l0hVarO = CollectionArtistDecorationPolicy.o();
        l0hVarO.r((ArtistSyncDecorationPolicy) ArtistSyncDecorationPolicy.newBuilder().setOfflineState(true).setSyncProgress(true).build());
        l0hVarO.q(ArtistCollectionDecorationPolicy.newBuilder().setIsFollowed(true).setNumAlbumsInCollection(true).setNumTracksInCollection(true).build());
        l0hVarO.n(ArtistDecorationPolicy.newBuilder().setName(true).setPortraits(true).build());
        g = l0hVarO.build();
        e0h e0hVarO = CollectionAlbumDecorationPolicy.o();
        e0hVarO.r((AlbumSyncDecorationPolicy) AlbumSyncDecorationPolicy.newBuilder().setOfflineState(true).setSyncProgress(true).build());
        e0hVarO.n((AlbumDecorationPolicy) AlbumDecorationPolicy.newBuilder().setName(true).setCovers(true).setLink(true).setYear(true).build());
        e0hVarO.q();
        h = e0hVarO.build();
    }

    public k0h(ynb0 ynb0Var, iyc0 iyc0Var, r5h r5hVar, s4b1 s4b1Var, String str) {
        this.a = ynb0Var;
        this.b = iyc0Var;
        this.c = r5hVar;
        this.d = s4b1Var;
        this.e = str;
    }
}
