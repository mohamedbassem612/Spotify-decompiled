package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nj10 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ oj10 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj10(oj10 oj10Var, onm onmVar) {
        super(onmVar);
        this.b = oj10Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarA = this.b.a(null, null, this);
        return d9nVarA == d9n.a ? d9nVarA : new e331(d9nVarA);
    }
}
