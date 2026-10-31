package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class azl1 {
    public static final trc0 a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.E();
        hru0VarS.x(sku0VarP);
        a = new trc0((PlaylistRequestDecorationPolicy) hru0VarS.build(), null, null, false, null, jqz0.a, null, 0, null, 478);
    }
}
