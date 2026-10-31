package p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w3e0 extends onm {
    public Throwable a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z3e0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3e0(z3e0 z3e0Var, onm onmVar) {
        super(onmVar);
        this.c = z3e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Effect.LoadMoreHomeStructure) null, this);
    }
}
