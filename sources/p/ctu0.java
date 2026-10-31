package p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ctu0 implements atu0 {
    public static final trc0 d;
    public final xrc0 a;
    public final mnk0 b;
    public final String c;

    static {
        Set setS0 = f46.S0(new orc0[]{sqc0.a, xqc0.a, yqc0.a});
        rrc0 rrc0Var = new rrc0(f46.S0(new dlc0[]{dlc0.b, dlc0.d, dlc0.g}));
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        sku0VarP.H();
        sku0VarP.R();
        sku0VarP.Z();
        sku0VarP.t();
        sku0VarP.l0();
        sku0VarP.k0();
        sku0VarP.W();
        sku0VarP.i0();
        sku0VarP.S();
        hru0VarS.x(sku0VarP);
        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
        llu0VarR.y(ShowDecorationPolicy.newBuilder().setLink(true));
        llu0VarR.s(EpisodeDecorationPolicy.newBuilder().setLink(true));
        hru0VarS.t(llu0VarR);
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true));
        hru0VarS.z(vwu0VarR);
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        fj90 fj90VarN = ItemExtensionPolicy.n();
        fj90VarN.r(clc0.g);
        fj90VarN.n(hz00.Z);
        iou0VarV.n(Collections.singletonList(fj90VarN.build()));
        hru0VarS.u(iou0VarV.build());
        d = new trc0(hru0VarS.build(), (g3d0) null, setS0, false, rrc0Var, hqz0.a, (prc0) null, 0, (List) null, 458);
    }

    public ctu0(xrc0 xrc0Var, z6k0 z6k0Var, mnk0 mnk0Var, String str) {
        this.a = xrc0Var;
        this.b = mnk0Var;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wsc0 wsc0Var, onm onmVar) {
        btu0 btu0Var;
        if (onmVar instanceof btu0) {
            btu0Var = (btu0) onmVar;
            int i = btu0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                btu0Var.d = i - Integer.MIN_VALUE;
            } else {
                btu0Var = new btu0(this, onmVar);
            }
        } else {
            btu0Var = new btu0(this, onmVar);
        }
        Object objI = btu0Var.b;
        int i2 = btu0Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20Var = this.b.a;
            btu0Var.a = wsc0Var;
            btu0Var.d = 1;
            objI = b5p1.i(mr20Var, btu0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wsc0Var = btu0Var.a;
            hm5.M(objI);
        }
        return Boolean.valueOf(((ibk0) objI).b() && z6k0.b(wsc0Var.f.q));
    }

    public final Single c() {
        return rqt0.F(o6x.a, new k1e0(this, (lnm) null, (byte) 26));
    }

    public final String h() {
        throw null;
    }
}
