package p;

import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class sde0 {
    public static final long a;
    public static final long b;
    public static final PlaylistTrackDecorationPolicy c;

    static {
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.e;
        a = fdg1.k0(5, ngvVar);
        b = fdg1.k0(2, ngvVar);
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true));
        c = vwu0VarR.build();
    }
}
