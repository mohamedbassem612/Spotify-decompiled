package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lv9 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ t4d1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv9(t4d1 t4d1Var, onm onmVar) {
        super(onmVar);
        this.b = t4d1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this, false);
    }
}
