package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o2c extends onm {
    public tv80 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p2c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2c(p2c p2cVar, onm onmVar) {
        super(onmVar);
        this.c = p2cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, null, false, false, null, this);
    }
}
