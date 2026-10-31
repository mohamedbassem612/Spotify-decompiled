package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wa11 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ya11 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa11(ya11 ya11Var, onm onmVar) {
        super(onmVar);
        this.b = ya11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
