package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sy80 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ty80 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy80(ty80 ty80Var, onm onmVar) {
        super(onmVar);
        this.c = ty80Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
