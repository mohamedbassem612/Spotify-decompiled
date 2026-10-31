package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hen0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ien0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hen0(ien0 ien0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = ien0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.b((vu30) null, this);
        return d9n.a;
    }
}
