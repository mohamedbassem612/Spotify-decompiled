package p;

import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class rfc0 {
    public static final trc0 a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
        dgu0VarP.n(AlbumDecorationPolicy.newBuilder().setCovers(true));
        vwu0VarR.s(dgu0VarP);
        hru0VarS.z(vwu0VarR);
        a = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, new iqz0(0, 3), (prc0) null, 0, (List) null, 478);
    }
}
