package p;

import spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z831 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ a931 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z831(a931 a931Var, onm onmVar) {
        super(onmVar);
        this.b = a931Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((ProgressPlaybackEsperanto.OnUpdateRequest) null, this);
    }
}
