package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m18 extends onm {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n18 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m18(n18 n18Var, onm onmVar) {
        super(onmVar);
        this.c = n18Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
