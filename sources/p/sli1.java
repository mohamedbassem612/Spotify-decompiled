package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sli1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ tli1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sli1(tli1 tli1Var, onm onmVar) {
        super(onmVar);
        this.c = tli1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
