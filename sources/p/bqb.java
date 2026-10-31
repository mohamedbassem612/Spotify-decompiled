package p;

import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bqb extends onm {
    public sy21 a;
    public n811 b;
    public long c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fqb f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqb(fqb fqbVar, onm onmVar) {
        super(onmVar);
        this.f = fqbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b((ResolveRequest) null, this);
    }
}
