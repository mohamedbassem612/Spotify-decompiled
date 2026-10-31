package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tcj1 extends onm {
    public bpb1 a;
    public VideoSurfaceView b;
    public vi11 c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vi11 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcj1(vi11 vi11Var, onm onmVar) {
        super(onmVar);
        this.f = vi11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.B(null, null, false, this);
    }
}
