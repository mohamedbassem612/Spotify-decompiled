package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a5l1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ c5l1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5l1(c5l1 c5l1Var, onm onmVar) {
        super(onmVar);
        this.b = c5l1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.Z0(this);
    }
}
