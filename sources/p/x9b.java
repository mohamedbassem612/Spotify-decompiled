package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x9b extends onm {
    public w9b a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aab c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9b(aab aabVar, onm onmVar) {
        super(onmVar);
        this.c = aabVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
