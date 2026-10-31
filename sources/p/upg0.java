package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class upg0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vpg0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upg0(vpg0 vpg0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = vpg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.collect(null, this);
        return d9n.a;
    }
}
