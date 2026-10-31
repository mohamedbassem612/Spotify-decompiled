package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q631 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ puz b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q631(puz puzVar, onm onmVar) {
        super(onmVar);
        this.b = puzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
