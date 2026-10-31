package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class by2 extends onm {
    public PlayerState a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gy2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by2(gy2 gy2Var, onm onmVar) {
        super(onmVar);
        this.c = gy2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
