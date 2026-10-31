package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gsb extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ lsb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsb(lsb lsbVar, onm onmVar) {
        super(onmVar);
        this.b = lsbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.B(null, false, this);
    }
}
