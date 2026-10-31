package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jqh0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ kqh0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqh0(kqh0 kqh0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = kqh0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
