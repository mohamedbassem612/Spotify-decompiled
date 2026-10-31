package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q7w0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ s7w0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7w0(s7w0 s7w0Var, onm onmVar) {
        super(onmVar);
        this.b = s7w0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objK = this.b.k(this);
        return objK == d9n.a ? objK : new e331(objK);
    }
}
