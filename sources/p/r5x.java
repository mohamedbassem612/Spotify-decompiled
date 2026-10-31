package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r5x extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u5x c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5x(u5x u5xVar, onm onmVar) {
        super(onmVar);
        this.c = u5xVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, this);
    }
}
