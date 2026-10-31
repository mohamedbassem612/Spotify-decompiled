package p;

import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vg8 extends onm {
    public x020 a;
    public ResolveRequest b;
    public long c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xg8 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg8(xg8 xg8Var, onm onmVar) {
        super(onmVar);
        this.f = xg8Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e((x020) null, 0L, this);
    }
}
