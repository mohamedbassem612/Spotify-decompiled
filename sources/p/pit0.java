package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pit0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ r4t0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pit0(r4t0 r4t0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = r4t0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
