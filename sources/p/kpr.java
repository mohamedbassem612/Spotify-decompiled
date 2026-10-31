package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kpr extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ rir c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpr(rir rirVar, lnm lnmVar) {
        super(lnmVar);
        this.c = rirVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
