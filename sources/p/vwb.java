package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vwb extends onm {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wwb c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwb(wwb wwbVar, onm onmVar) {
        super(onmVar);
        this.c = wwbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k0(0L, this);
    }
}
