package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lsh extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ h50 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsh(h50 h50Var, lnm lnmVar) {
        super(lnmVar);
        this.e = h50Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
