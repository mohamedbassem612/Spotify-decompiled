package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ap60 extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bp60 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap60(bp60 bp60Var, onm onmVar) {
        super(onmVar);
        this.c = bp60Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, this);
    }
}
