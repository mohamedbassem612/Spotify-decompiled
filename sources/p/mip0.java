package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mip0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ j4p0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mip0(j4p0 j4p0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = j4p0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
