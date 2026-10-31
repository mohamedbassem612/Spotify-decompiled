package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z9a1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ x9a1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9a1(x9a1 x9a1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = x9a1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
