package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class msu extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ inu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msu(inu inuVar, lnm lnmVar) {
        super(lnmVar);
        this.c = inuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
