package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vf90 implements iu30 {
    public static final trc0 b;
    public final xrc0 a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.E();
        hru0VarS.x(sku0VarP);
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
        playlistRequestDecorationPolicyBuild.getClass();
        b = new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
    }

    public vf90(xrc0 xrc0Var) {
        this.a = xrc0Var;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            Observable observableJust = Observable.just(Boolean.FALSE);
            observableJust.getClass();
            return observableJust;
        }
        Observable observableOnErrorReturn = yoi1.i(this.a.k(str, b), o6x.a).map(yz10.g).map(zz10.g).distinctUntilChanged().doOnError(k530.O0).onErrorReturn(a020.g);
        observableOnErrorReturn.getClass();
        return observableOnErrorReturn;
    }
}
