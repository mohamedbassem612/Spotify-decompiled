package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ujw extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bkw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujw(bkw bkwVar, onm onmVar) {
        super(onmVar);
        this.c = bkwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
