package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g4e extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ fdd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e(fdd fddVar, lnm lnmVar) {
        super(lnmVar);
        this.c = fddVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
