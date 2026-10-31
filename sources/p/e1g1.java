package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e1g1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f1g1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1g1(f1g1 f1g1Var, onm onmVar) {
        super(onmVar);
        this.c = f1g1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, this);
    }
}
