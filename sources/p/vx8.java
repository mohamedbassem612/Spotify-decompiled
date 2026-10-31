package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vx8 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ wx8 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx8(wx8 wx8Var, lnm lnmVar) {
        super(lnmVar);
        this.b = wx8Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
