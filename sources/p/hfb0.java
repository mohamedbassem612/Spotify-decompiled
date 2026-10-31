package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hfb0 extends onm {
    public kfb0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kfb0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfb0(kfb0 kfb0Var, onm onmVar) {
        super(onmVar);
        this.c = kfb0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
