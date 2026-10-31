package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xqg1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hrg1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqg1(hrg1 hrg1Var, onm onmVar) {
        super(onmVar);
        this.b = hrg1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
