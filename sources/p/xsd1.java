package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xsd1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ysd1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsd1(ysd1 ysd1Var, onm onmVar) {
        super(onmVar);
        this.b = ysd1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
