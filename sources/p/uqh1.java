package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uqh1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ dlg1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqh1(dlg1 dlg1Var, onm onmVar) {
        super(onmVar);
        this.b = dlg1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.D(this);
    }
}
