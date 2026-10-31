package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class afd1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ n77 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afd1(n77 n77Var, lnm lnmVar) {
        super(lnmVar);
        this.c = n77Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
