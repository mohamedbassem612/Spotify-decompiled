package p;

import com.spotify.ads.esperanto.proto.SetRequestHeadersRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lo61 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ oo61 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo61(oo61 oo61Var, onm onmVar) {
        super(onmVar);
        this.b = oo61Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b((SetRequestHeadersRequest) null, this);
    }
}
