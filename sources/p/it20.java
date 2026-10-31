package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class it20 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ gbh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it20(gbh gbhVar, lnm lnmVar) {
        super(lnmVar);
        this.b = gbhVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
