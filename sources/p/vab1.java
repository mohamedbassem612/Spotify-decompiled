package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vab1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ wab1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vab1(wab1 wab1Var, onm onmVar) {
        super(onmVar);
        this.b = wab1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, null, this);
    }
}
