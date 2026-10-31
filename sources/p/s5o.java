package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s5o extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ w5o b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5o(w5o w5oVar, onm onmVar) {
        super(onmVar);
        this.b = w5oVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b((String) null, this);
    }
}
