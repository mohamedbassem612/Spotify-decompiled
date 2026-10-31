package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class df0 extends onm {
    public t45 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gf0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(gf0 gf0Var, onm onmVar) {
        super(onmVar);
        this.c = gf0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((ContextTrack) null, (t45) null, this);
    }
}
