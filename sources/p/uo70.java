package p;

import com.spotify.musicappplatform.state.idle.api.MusicAppLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uo70 extends onm {
    public MusicAppLock a;
    public xgn0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wo70 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo70(wo70 wo70Var, onm onmVar) {
        super(onmVar);
        this.d = wo70Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(null, this);
    }
}
