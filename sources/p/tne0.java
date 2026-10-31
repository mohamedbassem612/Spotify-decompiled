package p;

import com.spotify.trending.v1.TrendingLocationSignalPayload;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tne0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ifl1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tne0(ifl1 ifl1Var, onm onmVar) {
        super(onmVar);
        this.b = ifl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.e((String) null, (TrendingLocationSignalPayload) null, this);
        return objE == d9n.a ? objE : new e331(objE);
    }
}
