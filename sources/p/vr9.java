package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vr9 extends onm {
    public ContextTrack a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ix7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr9(ix7 ix7Var, onm onmVar) {
        super(onmVar);
        this.d = ix7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.F((ContextTrack) null, false, this);
    }
}
