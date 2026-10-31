package p;

import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class ejp0 {
    public static final trc0 a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        hru0VarS.v(iou0VarV);
        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
        llu0VarR.v(EpisodePlayedStateDecorationPolicy.newBuilder().setIsPlayed(true));
        hru0VarS.t(llu0VarR);
        a = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
    }
}
