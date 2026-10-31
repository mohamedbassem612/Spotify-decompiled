package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tpo extends onm {
    public wy71 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ upo c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpo(upo upoVar, onm onmVar) {
        super(onmVar);
        this.c = upoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(0.0f, 0.0f, null, this);
    }
}
