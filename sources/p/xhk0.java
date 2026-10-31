package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xhk0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zhk0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhk0(zhk0 zhk0Var, onm onmVar) {
        super(onmVar);
        this.b = zhk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(null, null, null, null, this);
        return objC == d9n.a ? objC : new e331(objC);
    }
}
