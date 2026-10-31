package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yik0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bjk0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yik0(bjk0 bjk0Var, onm onmVar) {
        super(onmVar);
        this.b = bjk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
