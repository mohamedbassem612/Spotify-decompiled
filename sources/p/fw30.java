package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fw30 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ dqu b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw30(dqu dquVar, onm onmVar) {
        super(onmVar);
        this.b = dquVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, false, this);
    }
}
