package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jz91 {
    public static final trc0 b;
    public static final PlaylistRequestDecorationPolicy c;
    public final xrc0 a;

    static {
        i8i1 i8i1VarO = UserDecorationPolicy.o();
        i8i1VarO.s();
        i8i1VarO.t();
        i8i1VarO.q();
        i8i1VarO.u();
        UserDecorationPolicy userDecorationPolicyBuild = i8i1VarO.build();
        Set setSingleton = Collections.singleton(wqc0.a);
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.H();
        sku0VarP.k0();
        hru0VarS.x(sku0VarP);
        b = new trc0(hru0VarS.build(), (g3d0) null, setSingleton, false, (src0) null, (mqz0) null, (prc0) null, 0, (List) null, 506);
        hru0 hru0VarS2 = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.v();
        hru0VarS2.u(iou0VarV.build());
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.B();
        vwu0VarR.q(userDecorationPolicyBuild);
        hru0VarS2.y(vwu0VarR.build());
        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
        llu0VarR.A();
        llu0VarR.q(userDecorationPolicyBuild);
        hru0VarS2.s(llu0VarR.build());
        c = hru0VarS2.build();
    }

    public jz91(xrc0 xrc0Var, pvc pvcVar) {
        this.a = xrc0Var;
    }
}
