package p;

import com.spotify.ads.esperanto.proto.GetAdsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y32 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ z32 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y32(z32 z32Var, onm onmVar) {
        super(onmVar);
        this.b = z32Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((GetAdsRequest) null, this);
    }
}
