package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nj1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ oj1 c;
    public ti1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(oj1 oj1Var, onm onmVar) {
        super(onmVar);
        this.c = oj1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
