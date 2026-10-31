package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class wxc0 {
    public static final trc0 a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.F();
        hru0VarS.w(sku0VarP.build());
        a = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, qrc0.a, (mqz0) null, (prc0) null, 0, (List) null, 494);
    }
}
