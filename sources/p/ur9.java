package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ur9 extends onm {
    public ContextTrack a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ix7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur9(ix7 ix7Var, onm onmVar) {
        super(onmVar);
        this.c = ix7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l((ContextTrack) null, this);
    }
}
