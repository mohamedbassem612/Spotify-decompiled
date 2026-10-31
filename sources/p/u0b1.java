package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u0b1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ v0b1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0b1(v0b1 v0b1Var, onm onmVar) {
        super(onmVar);
        this.b = v0b1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.b(null, this);
    }
}
