package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tvu extends onm {
    public fvu a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xvu c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvu(xvu xvuVar, onm onmVar) {
        super(onmVar);
        this.c = xvuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
