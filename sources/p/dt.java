package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dt extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(bt btVar, lnm lnmVar) {
        super(lnmVar);
        this.c = btVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
