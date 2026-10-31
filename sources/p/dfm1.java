package p;

import com.spotify.wrapped.v1.proto.ShareAssetResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dfm1 extends onm {
    public ShareAssetResponse a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ efm1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfm1(efm1 efm1Var, onm onmVar) {
        super(onmVar);
        this.d = efm1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, null, this);
    }
}
