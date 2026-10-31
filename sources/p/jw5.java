package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jw5 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ kw5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw5(kw5 kw5Var, onm onmVar) {
        super(onmVar);
        this.b = kw5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == d9n.a ? objA : new pvg1((String) objA);
    }
}
