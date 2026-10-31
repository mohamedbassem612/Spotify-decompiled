package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vb31 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wb31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb31(wb31 wb31Var, onm onmVar) {
        super(onmVar);
        this.c = wb31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
