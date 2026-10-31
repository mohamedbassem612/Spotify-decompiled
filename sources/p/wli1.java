package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wli1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xli1 c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wli1(xli1 xli1Var, onm onmVar) {
        super(onmVar);
        this.c = xli1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
