package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r4s0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tzr0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4s0(tzr0 tzr0Var, onm onmVar) {
        super(onmVar);
        this.b = tzr0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objJ = this.b.j(null, null, this);
        return objJ == d9n.a ? objJ : new e331(objJ);
    }
}
