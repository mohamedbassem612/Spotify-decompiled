package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u4s0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tzr0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4s0(tzr0 tzr0Var, onm onmVar) {
        super(onmVar);
        this.b = tzr0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objS = this.b.s(this);
        return objS == d9n.a ? objS : new e331(objS);
    }
}
