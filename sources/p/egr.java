package p;

import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemOfflineStateDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class egr implements kn6 {
    public static final trc0 c;
    public final r5h a;
    public final xrc0 b;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        ol90 ol90VarO = ItemOfflineStateDecorationPolicy.o();
        ol90VarO.q(true);
        iou0VarV.z(ol90VarO);
        hru0VarS.v(iou0VarV);
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true).setPlayable(true));
        hru0VarS.z(vwu0VarR);
        c = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
    }

    public egr(r5h r5hVar, xrc0 xrc0Var) {
        this.a = r5hVar;
        this.b = xrc0Var;
    }
}
