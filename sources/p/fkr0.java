package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fkr0 extends onm {
    public int a;
    public fe5 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jkr0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkr0(jkr0 jkr0Var, lnm lnmVar) {
        super(lnmVar);
        this.d = jkr0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= os00.INVALID_ID;
        return this.d.f(0, (fe5) null, this);
    }
}
