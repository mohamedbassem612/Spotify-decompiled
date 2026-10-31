package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class psa0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ qsa0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psa0(qsa0 qsa0Var, onm onmVar) {
        super(onmVar);
        this.c = qsa0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
