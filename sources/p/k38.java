package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k38 extends onm {
    public ty60 a;
    public Exception b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ty60 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k38(ty60 ty60Var, onm onmVar) {
        super(onmVar);
        this.d = ty60Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return ty60.f(this.d, this);
    }
}
