package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sx5 extends onm {
    public sc01 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tx5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx5(tx5 tx5Var, onm onmVar) {
        super(onmVar);
        this.c = tx5Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((sc01) null, this);
    }
}
