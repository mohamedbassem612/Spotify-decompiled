package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z9o extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dao c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9o(dao daoVar, onm onmVar) {
        super(onmVar);
        this.c = daoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, this);
    }
}
