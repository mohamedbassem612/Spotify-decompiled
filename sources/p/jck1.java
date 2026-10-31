package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jck1 extends onm {
    public t45 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pck1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jck1(pck1 pck1Var, onm onmVar) {
        super(onmVar);
        this.c = pck1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((PlayerState) null, (t45) null, this);
    }
}
