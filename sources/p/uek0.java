package p;

import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uek0 extends hab0 implements Function0 {
    public static final uek0 a = new uek0(0);

    public final Object invoke() {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        hru0VarS.v(iou0VarV);
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.A();
        vwu0VarR.w();
        vwu0VarR.v(true);
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setPlayable(true));
        hru0VarS.z(vwu0VarR);
        return hru0VarS.build();
    }
}
