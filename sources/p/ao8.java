package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ao8 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bo8 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao8(bo8 bo8Var, onm onmVar) {
        super(onmVar);
        this.b = bo8Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
