package p;

import com.spotify.player.model.command.options.LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k64 extends onm {
    public long a;
    public LoggingParams b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m64 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k64(m64 m64Var, onm onmVar) {
        super(onmVar);
        this.d = m64Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0L, null, this);
    }
}
