package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bqm1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dqm1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqm1(dqm1 dqm1Var, onm onmVar) {
        super(onmVar);
        this.c = dqm1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e((String) null, this);
    }
}
