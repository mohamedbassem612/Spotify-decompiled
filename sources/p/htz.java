package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class htz extends onm {
    public itz a;
    public /* synthetic */ Object b;
    public final /* synthetic */ itz c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htz(itz itzVar, onm onmVar) {
        super(onmVar);
        this.c = itzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, 0.0d, this);
    }
}
