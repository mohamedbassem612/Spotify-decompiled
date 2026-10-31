package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d1g1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ f1g1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1g1(f1g1 f1g1Var, onm onmVar) {
        super(onmVar);
        this.b = f1g1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
