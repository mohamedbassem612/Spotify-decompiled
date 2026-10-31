package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rxl1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ sxl1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxl1(sxl1 sxl1Var, onm onmVar) {
        super(onmVar);
        this.b = sxl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
