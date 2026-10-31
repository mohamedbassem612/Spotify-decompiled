package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vy81 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ az81 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy81(az81 az81Var, onm onmVar) {
        super(onmVar);
        this.b = az81Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, 0, this);
    }
}
