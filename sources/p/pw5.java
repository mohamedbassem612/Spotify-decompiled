package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pw5 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ tv5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw5(tv5 tv5Var, lnm lnmVar) {
        super(lnmVar);
        this.c = tv5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
