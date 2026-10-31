package p;

import com.spotify.player.esperanto.proto.EsContextPlayerState;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fdk0 extends onm {
    public lhg1 a;
    public String b;
    public String c;
    public EsLoggingParams$LoggingParams d;
    public EsContextPlayerState.ContextPlayerState e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ldk0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdk0(ldk0 ldk0Var, onm onmVar) {
        super(onmVar);
        this.h = ldk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(null, null, null, null, this);
    }
}
