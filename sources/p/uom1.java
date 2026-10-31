package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uom1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ cm0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uom1(cm0 cm0Var, onm onmVar) {
        super(onmVar);
        this.b = cm0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.s(null, this);
    }
}
