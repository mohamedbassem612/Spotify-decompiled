package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eza1 extends onm {
    public fza1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fza1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eza1(fza1 fza1Var, onm onmVar) {
        super(onmVar);
        this.c = fza1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
