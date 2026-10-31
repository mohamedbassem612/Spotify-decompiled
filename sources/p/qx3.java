package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qx3 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ sx3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx3(sx3 sx3Var, onm onmVar) {
        super(onmVar);
        this.b = sx3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
