package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yw3 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ax3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw3(ax3 ax3Var, onm onmVar) {
        super(onmVar);
        this.b = ax3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
