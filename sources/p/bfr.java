package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bfr extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ cfr b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfr(cfr cfrVar, onm onmVar) {
        super(onmVar);
        this.b = cfrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
