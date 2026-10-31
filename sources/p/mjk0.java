package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mjk0 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qjk0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjk0(qjk0 qjk0Var, onm onmVar) {
        super(onmVar);
        this.c = qjk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
