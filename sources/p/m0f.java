package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m0f extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ n0f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0f(n0f n0fVar, onm onmVar) {
        super(onmVar);
        this.c = n0fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
