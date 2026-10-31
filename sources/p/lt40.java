package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lt40 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ nt40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt40(nt40 nt40Var, onm onmVar) {
        super(onmVar);
        this.b = nt40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.c(null, null, null, this);
    }
}
