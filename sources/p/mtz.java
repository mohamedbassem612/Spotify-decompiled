package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mtz extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ qtz b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtz(qtz qtzVar, onm onmVar) {
        super(onmVar);
        this.b = qtzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e((String) null, this);
    }
}
