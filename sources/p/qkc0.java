package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qkc0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ rkc0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkc0(rkc0 rkc0Var, onm onmVar) {
        super(onmVar);
        this.b = rkc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
