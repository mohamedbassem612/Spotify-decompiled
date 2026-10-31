package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class io2 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lo2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io2(lo2 lo2Var, onm onmVar) {
        super(onmVar);
        this.c = lo2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c((String) null, this);
    }
}
