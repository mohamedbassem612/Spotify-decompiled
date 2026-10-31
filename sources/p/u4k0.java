package p;

import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemMetadataPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u4k0 {
    public final ve01 a;

    public u4k0(String str, xrc0 xrc0Var, c9n c9nVar) {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        nl90 nl90VarO = ItemMetadataPolicy.o();
        nl90VarO.r(true);
        nl90VarO.n();
        iou0VarV.w(nl90VarO);
        hru0VarS.v(iou0VarV);
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.A();
        vwu0VarR.v(true);
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true).setName(true).setPlayable(true));
        vwu0VarR.s(PlaylistAlbumDecorationPolicy.p());
        vwu0VarR.t(ArtistDecorationPolicy.newBuilder().setName(true));
        hru0VarS.z(vwu0VarR);
        this.a = d5p1.r(rqt0.u(new f8f0(((rsc0) xrc0Var).k(str, new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, v4k0.a, hqz0.a, (prc0) null, 0, (List) null, 462)), (byte) 29)), c9nVar, ey71.b, 1);
    }
}
