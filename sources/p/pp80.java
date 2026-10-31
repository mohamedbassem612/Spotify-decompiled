package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pp80 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ qp80 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp80(qp80 qp80Var, lnm lnmVar) {
        super(lnmVar);
        this.b = qp80Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.b(null, this);
        return d9n.a;
    }
}
