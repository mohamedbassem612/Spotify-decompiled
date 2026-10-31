package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w1m1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vi11 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1m1(vi11 vi11Var, onm onmVar) {
        super(onmVar);
        this.b = vi11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
