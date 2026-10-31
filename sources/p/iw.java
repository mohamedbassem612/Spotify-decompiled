package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iw extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ kw b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(kw kwVar, onm onmVar) {
        super(onmVar);
        this.b = kwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
