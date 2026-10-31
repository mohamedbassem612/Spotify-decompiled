package p;

import com.spotify.browse.clientnative.mobius.BrowseEffect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y0e0 extends onm {
    public BrowseEffect.Load a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b1e0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0e0(b1e0 b1e0Var, onm onmVar) {
        super(onmVar);
        this.c = b1e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
