package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hri1 extends onm {
    public bq1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dlg1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hri1(dlg1 dlg1Var, onm onmVar) {
        super(onmVar);
        this.c = dlg1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
