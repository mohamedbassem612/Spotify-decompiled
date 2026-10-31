package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pro extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ sro b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pro(sro sroVar, onm onmVar) {
        super(onmVar);
        this.b = sroVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, null, this);
    }
}
