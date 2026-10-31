package p;

import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class smc extends onm {
    public enc a;
    public EsLoggingParams$LoggingParams b;
    public EsPlayOrigin.PlayOrigin c;
    public hqz0 d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ vmc g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smc(vmc vmcVar, onm onmVar) {
        super(onmVar);
        this.g = vmcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b((enc) null, false, this);
    }
}
