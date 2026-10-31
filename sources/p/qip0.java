package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qip0 extends onm {
    public vzg0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sip0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qip0(sip0 sip0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = sip0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.invoke(null, this);
    }
}
