package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s4c extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ a5c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4c(a5c a5cVar, onm onmVar) {
        super(onmVar);
        this.b = a5cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m(this);
    }
}
