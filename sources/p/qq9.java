package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qq9 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ymm0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq9(ymm0 ymm0Var, onm onmVar) {
        super(onmVar);
        this.b = ymm0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.c((String) null, this);
    }
}
