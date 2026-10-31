package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tmd1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ umd1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmd1(umd1 umd1Var, onm onmVar) {
        super(onmVar);
        this.c = umd1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
