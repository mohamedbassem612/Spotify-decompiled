package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fvr extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hvr b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvr(hvr hvrVar, onm onmVar) {
        super(onmVar);
        this.b = hvrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objD = this.b.d(null, this);
        return objD == d9n.a ? objD : new e331(objD);
    }
}
