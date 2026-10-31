package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class skd implements c0u0 {
    public final /* synthetic */ vkd a;

    public skd(vkd vkdVar) {
        this.a = vkdVar;
    }

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        this.a.J();
    }

    public final void K(long j, long j2) {
        vkd vkdVar = this.a;
        vkdVar.J();
        ne neVar = vkdVar.Z0;
        ikd ikdVar = vkdVar.v1;
        if (ikdVar == null) {
            u890.C("canvasTrack");
            throw null;
        }
        ((PublishSubject) neVar.c).onNext(new xjd(ikdVar.a, false));
        ikd ikdVar2 = vkdVar.v1;
        if (ikdVar2 == null) {
            u890.C("canvasTrack");
            throw null;
        }
        ju8 ju8Var = vkdVar.y1;
        j1 j1Var = new j1(2, vkdVar, vkd.class, "logCanvasLoadEvent", "logCanvasLoadEvent(Lcom/spotify/canvas/canvas/model/CanvasTrack;Lcom/spotify/canvas/canvasimpl/carouselitem/CanvasLoadEvent;)V", 0, (byte) 15);
        if (ju8Var.a && ju8Var.b) {
            j1Var.invoke(ikdVar2, wjd.a);
        }
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        vkd vkdVar = this.a;
        vkdVar.J();
        vkdVar.K(betamaxException);
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        vkd vkdVar = this.a;
        vkdVar.J();
        vkdVar.K(betamaxException);
    }

    public final void m(long j, long j2) {
        vkd vkdVar = this.a;
        vkdVar.M();
        ne neVar = vkdVar.Z0;
        ikd ikdVar = vkdVar.v1;
        if (ikdVar == null) {
            u890.C("canvasTrack");
            throw null;
        }
        String str = ikdVar.a;
        ((LinkedHashSet) neVar.b).add(str);
        ((PublishSubject) neVar.c).onNext(new xjd(str, true));
        ikd ikdVar2 = vkdVar.v1;
        if (ikdVar2 == null) {
            u890.C("canvasTrack");
            throw null;
        }
        ju8 ju8Var = vkdVar.y1;
        j1 j1Var = new j1(2, vkdVar, vkd.class, "logCanvasLoadEvent", "logCanvasLoadEvent(Lcom/spotify/canvas/canvas/model/CanvasTrack;Lcom/spotify/canvas/canvasimpl/carouselitem/CanvasLoadEvent;)V", 0, (byte) 14);
        if (ju8Var.a && ju8Var.b) {
            j1Var.invoke(ikdVar2, wjd.b);
        }
    }
}
