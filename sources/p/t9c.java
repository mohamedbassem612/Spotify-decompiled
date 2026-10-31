package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t9c extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ u9c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9c(u9c u9cVar, onm onmVar) {
        super(onmVar);
        this.b = u9cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b((jce0) null, false, this);
    }
}
