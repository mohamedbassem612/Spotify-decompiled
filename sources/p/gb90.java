package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gb90 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hb90 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb90(hb90 hb90Var, onm onmVar) {
        super(onmVar);
        this.b = hb90Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, this);
    }
}
