package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class daj1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ czs a;
    public final /* synthetic */ p2t b;

    public daj1(czs czsVar, p2t p2tVar) {
        this.a = czsVar;
        this.b = p2tVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        VideoSurfaceView videoSurfaceView;
        fkb0 fkb0Var = (fkb0) obj;
        czs czsVar = this.a;
        uoa uoaVarA = czsVar.a();
        if (uoaVarA != null && (videoSurfaceView = czsVar.b) != null) {
            uoaVarA.k(videoSurfaceView);
        }
        pxc.a(this.b, fkb0Var.a.a, null, "open_split", null, 26);
        return rih1.a;
    }
}
