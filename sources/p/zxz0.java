package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zxz0 extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j0z0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxz0(j0z0 j0z0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = j0z0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(false, this);
    }
}
