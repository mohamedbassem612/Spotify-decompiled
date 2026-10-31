package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gri1 extends onm {
    public rbv a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bih1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gri1(bih1 bih1Var, onm onmVar) {
        super(onmVar);
        this.c = bih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
