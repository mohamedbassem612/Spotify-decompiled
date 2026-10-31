package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eyh1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fyh1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyh1(fyh1 fyh1Var, onm onmVar) {
        super(onmVar);
        this.b = fyh1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
