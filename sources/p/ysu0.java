package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ysu0 {
    public final xrc0 a;
    public final ReplaySubject b;
    public final trc0 c;

    public ysu0(xrc0 xrc0Var, ReplaySubject replaySubject) {
        this.a = xrc0Var;
        this.b = replaySubject;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.E();
        hru0VarS.x(sku0VarP);
        this.c = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
    }
}
