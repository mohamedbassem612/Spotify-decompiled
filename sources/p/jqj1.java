package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jqj1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ qu2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqj1(qu2 qu2Var, onm onmVar) {
        super(onmVar);
        this.b = qu2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f((PlayerState) null, this);
    }
}
