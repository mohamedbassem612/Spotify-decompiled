package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class emw extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ fmw c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emw(fmw fmwVar, onm onmVar) {
        super(onmVar);
        this.c = fmwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
