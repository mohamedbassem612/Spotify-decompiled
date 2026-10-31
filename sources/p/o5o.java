package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o5o extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ q5o b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5o(q5o q5oVar, onm onmVar) {
        super(onmVar);
        this.b = q5oVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, this);
    }
}
