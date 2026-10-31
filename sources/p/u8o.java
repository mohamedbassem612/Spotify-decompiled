package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u8o extends onm {
    public a6n1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v8o c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8o(v8o v8oVar, onm onmVar) {
        super(onmVar);
        this.c = v8oVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
