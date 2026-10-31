package p;

import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksRequest;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedTrackDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xp01 {
    public static final tr80 c = new tr80(200, 299, 1);
    public static final long d;
    public static final GetRecentlyPlayedTracksRequest e;
    public final pp01 a;
    public final zjf1 b;

    static {
        ytw0 ytw0Var = jfv.b;
        d = fdg1.k0(10, ngv.e);
        kp40 kp40VarN = GetRecentlyPlayedTracksRequest.n();
        vp01 vp01VarN = RecentlyPlayedTrackDecorationPolicy.n();
        vp01VarN.s((TrackDecorationPolicy) TrackDecorationPolicy.newBuilder().setLink(true).build());
        kp40VarN.n((RecentlyPlayedTrackDecorationPolicy) vp01VarN.build());
        e = (GetRecentlyPlayedTracksRequest) kp40VarN.build();
    }

    public xp01(pp01 pp01Var, zjf1 zjf1Var) {
        this.a = pp01Var;
        this.b = zjf1Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if (r10 == r8) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r10) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xp01.a(p.onm):java.lang.Object");
    }
}
