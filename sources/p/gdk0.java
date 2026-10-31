package p;

import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gdk0 extends onm {
    public EsLoggingParams$LoggingParams a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ldk0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdk0(ldk0 ldk0Var, onm onmVar) {
        super(onmVar);
        this.d = ldk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, 0, this);
    }
}
