package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mzs extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nzs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzs(nzs nzsVar, lnm lnmVar) {
        super(lnmVar);
        this.c = nzsVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
