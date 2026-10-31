package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pks extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ryr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pks(ryr ryrVar, lnm lnmVar) {
        super(lnmVar);
        this.c = ryrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
