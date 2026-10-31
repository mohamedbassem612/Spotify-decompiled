package p;

import com.spotify.player.model.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tna1 extends onm {
    public t45 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vna1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tna1(vna1 vna1Var, onm onmVar) {
        super(onmVar);
        this.c = vna1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Context) null, (t45) null, this);
    }
}
