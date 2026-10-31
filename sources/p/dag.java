package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dag extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gag c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dag(gag gagVar, onm onmVar) {
        super(onmVar);
        this.c = gagVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
