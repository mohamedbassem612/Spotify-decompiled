package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class io11 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ p8a b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io11(p8a p8aVar, onm onmVar) {
        super(onmVar);
        this.b = p8aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.c(0.0f, this);
    }
}
