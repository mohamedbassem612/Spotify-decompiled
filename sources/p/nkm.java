package p;

import com.spotify.player.model.command.options.LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nkm extends onm {
    public String a;
    public LoggingParams b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qkm d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkm(qkm qkmVar, onm onmVar) {
        super(onmVar);
        this.d = qkmVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, null, this);
    }
}
