package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dgv0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ cgv0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgv0(cgv0 cgv0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = cgv0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
