package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hru extends onm {
    public r571 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jru c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hru(jru jruVar, onm onmVar) {
        super(onmVar);
        this.c = jruVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, this);
    }
}
