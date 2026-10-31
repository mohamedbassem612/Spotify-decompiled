package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g4s extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ i4s b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4s(i4s i4sVar, onm onmVar) {
        super(onmVar);
        this.b = i4sVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
