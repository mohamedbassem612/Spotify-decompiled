package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h6k0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ i6k0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6k0(i6k0 i6k0Var, onm onmVar) {
        super(onmVar);
        this.b = i6k0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarA = this.b.a(null, null, this, null);
        return d9nVarA == d9n.a ? d9nVarA : new e331(d9nVarA);
    }
}
