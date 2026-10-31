package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class awf1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jwf1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awf1(jwf1 jwf1Var, onm onmVar) {
        super(onmVar);
        this.b = jwf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d((String) null, this);
    }
}
