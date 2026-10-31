package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sc10 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ yc10 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc10(yc10 yc10Var, onm onmVar) {
        super(onmVar);
        this.b = yc10Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
