package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iu51 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uqs0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu51(uqs0 uqs0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = uqs0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(false, this);
    }
}
