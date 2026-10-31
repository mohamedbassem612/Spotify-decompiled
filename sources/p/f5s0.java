package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f5s0 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i5s0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5s0(i5s0 i5s0Var, onm onmVar) {
        super(onmVar);
        this.c = i5s0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, null, this);
    }
}
