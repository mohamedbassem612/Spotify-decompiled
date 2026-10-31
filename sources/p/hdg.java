package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class hdg {
    public static final trc0 a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.N();
        sku0VarP.R();
        sku0VarP.Z();
        i8i1 i8i1VarO = UserDecorationPolicy.o();
        i8i1VarO.s();
        i8i1VarO.u();
        sku0VarP.Y(i8i1VarO);
        hru0VarS.x(sku0VarP);
        a = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
    }
}
