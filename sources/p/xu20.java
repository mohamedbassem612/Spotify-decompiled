package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xu20 extends onm {
    public p811 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wem c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu20(wem wemVar, lnm lnmVar) {
        super(lnmVar);
        this.c = wemVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
