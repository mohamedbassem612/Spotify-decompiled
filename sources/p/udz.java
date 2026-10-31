package p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemMetadataPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class udz {
    public static final trc0 a;

    static {
        Set setS0 = f46.S0(new orc0[]{pqc0.a, drc0.a});
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        nl90 nl90VarO = ItemMetadataPolicy.o();
        nl90VarO.r(true);
        iou0VarV.w(nl90VarO);
        hru0VarS.v(iou0VarV);
        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
        llu0VarR.y(ShowDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true));
        llu0VarR.s(EpisodeDecorationPolicy.newBuilder().setLength(true).setCovers(true));
        llu0VarR.v(EpisodePlayedStateDecorationPolicy.newBuilder().setLastPlayedAt(true).setIsPlayed(true).setTimeLeft(true).setPlayabilityRestriction(true));
        llu0VarR.B(EpisodeSyncDecorationPolicy.newBuilder().setOffline(true));
        hru0VarS.t(llu0VarR);
        a = new trc0(hru0VarS.build(), n2d0.a, setS0, false, (src0) null, (mqz0) null, (prc0) null, 1000, (List) null, 376);
    }
}
