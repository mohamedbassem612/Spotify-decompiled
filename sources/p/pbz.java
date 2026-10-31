package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pbz extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ lgy b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbz(lgy lgyVar, onm onmVar) {
        super(onmVar);
        this.b = lgyVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
