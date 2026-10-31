package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fov extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cm0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fov(cm0 cm0Var, onm onmVar) {
        super(onmVar);
        this.c = cm0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.r(null, this);
    }
}
