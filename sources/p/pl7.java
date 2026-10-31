package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pl7 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ a42 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl7(a42 a42Var, onm onmVar) {
        super(onmVar);
        this.b = a42Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarA = this.b.a(null, this);
        return d9nVarA == d9n.a ? d9nVarA : new e331(d9nVarA);
    }
}
