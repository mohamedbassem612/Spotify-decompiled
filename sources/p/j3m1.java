package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class j3m1 {
    public static final trc0 a;
    public static final long b;
    public static final long c;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        sku0VarP.W();
        sku0VarP.k0();
        hru0VarS.w(sku0VarP.build());
        a = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.e;
        b = fdg1.k0(1, ngvVar);
        c = fdg1.k0(10, ngvVar);
    }
}
