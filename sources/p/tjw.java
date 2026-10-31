package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tjw extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ akw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjw(akw akwVar, onm onmVar) {
        super(onmVar);
        this.c = akwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
