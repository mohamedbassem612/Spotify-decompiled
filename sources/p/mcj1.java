package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mcj1 extends onm {
    public fv0 a;
    public uoa b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ncj1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcj1(ncj1 ncj1Var, onm onmVar) {
        super(onmVar);
        this.e = ncj1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= os00.INVALID_ID;
        return this.e.c(null, this);
    }
}
