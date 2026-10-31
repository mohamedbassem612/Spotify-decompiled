package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ao61 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ no61 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao61(no61 no61Var, lnm lnmVar) {
        super(lnmVar);
        this.b = no61Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(null, this);
    }
}
