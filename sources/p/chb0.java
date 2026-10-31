package p;

import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemMetadataPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class chb0 {
    public static final PlaylistRequestDecorationPolicy e;
    public static final rrc0 f;
    public final iib0 a;
    public final xrc0 b;
    public final vtc0 c;
    public final m441 d = new m441(new m2a0(this, (lnm) null, (byte) 3));

    static {
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
        dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
        dgu0VarP.n(AlbumDecorationPolicy.newBuilder().setCovers(true));
        vwu0VarR.s(dgu0VarP);
        vwu0VarR.t(ArtistDecorationPolicy.newBuilder().setName(true));
        hru0VarS.z(vwu0VarR);
        e = hru0VarS.build();
        f = new rrc0(Collections.singleton(dlc0.d));
    }

    public chb0(iib0 iib0Var, xrc0 xrc0Var, vtc0 vtc0Var) {
        this.a = iib0Var;
        this.b = xrc0Var;
        this.c = vtc0Var;
    }
}
