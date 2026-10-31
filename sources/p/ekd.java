package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ekd extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ cab b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekd(cab cabVar, onm onmVar) {
        super(onmVar);
        this.b = cabVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.o(null, this);
    }
}
