package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d4b extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ g4b b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4b(g4b g4bVar, onm onmVar) {
        super(onmVar);
        this.b = g4bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
