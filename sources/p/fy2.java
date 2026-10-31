package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fy2 extends onm {
    public boolean a;
    public boolean b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gy2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy2(gy2 gy2Var, onm onmVar) {
        super(onmVar);
        this.e = gy2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g((PlayerState) null, this);
    }
}
