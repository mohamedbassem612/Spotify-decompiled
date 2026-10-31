package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p6b1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ q6b1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6b1(q6b1 q6b1Var, onm onmVar) {
        super(onmVar);
        this.b = q6b1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a((String) null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
