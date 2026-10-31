package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class it2 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jt2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it2(jt2 jt2Var, onm onmVar) {
        super(onmVar);
        this.b = jt2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
