package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d7c extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f7c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7c(f7c f7cVar, onm onmVar) {
        super(onmVar);
        this.c = f7cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
