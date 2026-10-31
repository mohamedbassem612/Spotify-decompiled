package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dy2 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ gy2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy2(gy2 gy2Var, onm onmVar) {
        super(onmVar);
        this.b = gy2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
