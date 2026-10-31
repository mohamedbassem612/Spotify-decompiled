package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class evr extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hvr b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evr(hvr hvrVar, lnm lnmVar) {
        super(lnmVar);
        this.b = hvrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.invoke(null, this);
    }
}
