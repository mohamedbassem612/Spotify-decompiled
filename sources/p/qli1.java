package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qli1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ rli1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qli1(rli1 rli1Var, onm onmVar) {
        super(onmVar);
        this.c = rli1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
