package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mt40 extends onm {
    public a8d1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nt40 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt40(nt40 nt40Var, onm onmVar) {
        super(onmVar);
        this.c = nt40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.d(null, null, null, null, this);
    }
}
