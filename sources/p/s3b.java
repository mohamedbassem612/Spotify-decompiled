package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s3b extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ t3b b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3b(t3b t3bVar, onm onmVar) {
        super(onmVar);
        this.b = t3bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
