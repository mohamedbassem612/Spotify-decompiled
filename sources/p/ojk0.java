package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ojk0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ qjk0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojk0(qjk0 qjk0Var, onm onmVar) {
        super(onmVar);
        this.b = qjk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.e(null, this, false);
        return objE == d9n.a ? objE : new e331(objE);
    }
}
