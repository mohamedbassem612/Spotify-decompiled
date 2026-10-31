package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lm40 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ om40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm40(om40 om40Var, onm onmVar) {
        super(onmVar);
        this.b = om40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((ContextTrack) null, this);
    }
}
