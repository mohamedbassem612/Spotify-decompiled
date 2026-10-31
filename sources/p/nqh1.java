package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nqh1 extends onm {
    public int a;
    public int b;
    public alg1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ alg1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqh1(alg1 alg1Var, onm onmVar) {
        super(onmVar);
        this.e = alg1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.h(this);
    }
}
