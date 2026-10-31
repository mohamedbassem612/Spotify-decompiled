package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vj8 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ix7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj8(ix7 ix7Var, onm onmVar) {
        super(onmVar);
        this.b = ix7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, this);
    }
}
