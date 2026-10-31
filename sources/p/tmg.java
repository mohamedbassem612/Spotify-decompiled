package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tmg extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fna b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmg(fna fnaVar, onm onmVar) {
        super(onmVar);
        this.b = fnaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, 0L, 0L, this);
    }
}
