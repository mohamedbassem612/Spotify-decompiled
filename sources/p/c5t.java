package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c5t extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ uo5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5t(uo5 uo5Var, onm onmVar) {
        super(onmVar);
        this.b = uo5Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.E((String) null, 0, 0, (ir20) null, this);
    }
}
