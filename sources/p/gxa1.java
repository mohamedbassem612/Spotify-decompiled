package p;

import com.spotify.player.esperanto.proto.EsLoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gxa1 extends onm {
    public String a;
    public EsLoggingParams.LoggingParams b;
    public double c;
    public /* synthetic */ Object d;
    public final /* synthetic */ esa1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxa1(esa1 esa1Var, onm onmVar) {
        super(onmVar);
        this.e = esa1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.x(null, 0.0d, this);
    }
}
