package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lx80 extends onm {
    public String a;
    public el81 b;
    public PlayerState c;
    public kl81[] d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ st60 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx80(st60 st60Var, onm onmVar) {
        super(onmVar);
        this.g = st60Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.G(null, null, false, this);
    }
}
