package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hdn extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ gal b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdn(gal galVar, onm onmVar) {
        super(onmVar);
        this.b = galVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g((String) null, this);
    }
}
