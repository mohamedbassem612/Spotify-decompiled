package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ci10 implements ioc0 {
    public final /* synthetic */ byte a;
    public final xrc0 b;
    public final trc0 c;

    public ci10(xrc0 xrc0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = xrc0Var;
                hru0 builder = PlaylistRequestDecorationPolicy.n().toBuilder();
                sku0 builder2 = PlaylistDecorationPolicy.o().toBuilder();
                builder2.S();
                builder2.W();
                builder2.G();
                builder2.H();
                builder2.U();
                builder.w(builder2.build());
                this.c = new trc0(builder.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                break;
            case 2:
                this.b = xrc0Var;
                hru0 builder3 = PlaylistRequestDecorationPolicy.n().toBuilder();
                sku0 builder4 = PlaylistDecorationPolicy.o().toBuilder();
                builder4.S();
                builder4.G();
                builder4.U();
                builder3.w(builder4.build());
                this.c = new trc0(builder3.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                break;
            default:
                this.b = xrc0Var;
                hru0 builder5 = PlaylistRequestDecorationPolicy.n().toBuilder();
                sku0 builder6 = PlaylistDecorationPolicy.o().toBuilder();
                builder6.G();
                builder6.U();
                builder5.w(builder6.build());
                this.c = new trc0(builder5.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                break;
        }
    }

    @Override // p.ioc0
    public final Observable a(String str, String str2) {
        byte b = this.a;
        j5 j5Var = j5.a;
        o6x o6xVar = o6x.a;
        trc0 trc0Var = this.c;
        rsc0 rsc0Var = this.b;
        switch (b) {
            case 0:
                return yoi1.i(rsc0Var.k(str2, trc0Var), o6xVar).map(new uny(str, str2, this, (byte) 22)).onErrorReturnItem(j5Var);
            case 1:
                return yoi1.i(rsc0Var.k(str2, trc0Var), o6xVar).map(new r0s0(str, str2, this)).onErrorReturnItem(j5Var);
            default:
                return yoi1.i(rsc0Var.k(str2, trc0Var), o6xVar).map(new r961(str, str2, this, (byte) 17)).onErrorReturnItem(j5Var);
        }
    }
}
