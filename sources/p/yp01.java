package p;

import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksRequest;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedTrackDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yp01 {
    public final sjj0 a;
    public final lfb b;
    public final np01 c;
    public final GetRecentlyPlayedTracksRequest d;

    public yp01(sjj0 sjj0Var, lfb lfbVar, np01 np01Var) {
        this.a = sjj0Var;
        this.b = lfbVar;
        this.c = np01Var;
        kp40 kp40VarN = GetRecentlyPlayedTracksRequest.n();
        vp01 vp01VarN = RecentlyPlayedTrackDecorationPolicy.n();
        vp01VarN.s((TrackDecorationPolicy) TrackDecorationPolicy.newBuilder().setLink(true).setName(true).build());
        vp01VarN.n((AlbumDecorationPolicy) AlbumDecorationPolicy.newBuilder().setCovers(true).build());
        vp01VarN.q((ArtistDecorationPolicy) ArtistDecorationPolicy.newBuilder().setLink(true).setName(true).build());
        kp40VarN.n((RecentlyPlayedTrackDecorationPolicy) vp01VarN.build());
        this.d = (GetRecentlyPlayedTracksRequest) kp40VarN.build();
    }
}
