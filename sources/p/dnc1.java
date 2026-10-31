package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dnc1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ enc1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnc1(enc1 enc1Var, lnm lnmVar) {
        super(lnmVar);
        this.b = enc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.collect(null, this);
        return d9n.a;
    }
}
