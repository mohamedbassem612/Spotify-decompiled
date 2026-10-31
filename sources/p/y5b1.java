package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y5b1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ esa1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5b1(esa1 esa1Var, onm onmVar) {
        super(onmVar);
        this.b = esa1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(this);
    }
}
