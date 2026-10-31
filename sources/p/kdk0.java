package p;

import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kdk0 extends onm {
    public boolean a;
    public boolean b;
    public Integer c;
    public EsLoggingParams$LoggingParams d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ldk0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdk0(ldk0 ldk0Var, onm onmVar) {
        super(onmVar);
        this.f = ldk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.k(false, null, this);
    }
}
