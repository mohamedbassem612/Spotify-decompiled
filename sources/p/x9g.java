package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x9g extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gag c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9g(gag gagVar, onm onmVar) {
        super(onmVar);
        this.c = gagVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this, false);
    }
}
