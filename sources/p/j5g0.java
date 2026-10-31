package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j5g0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ r90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5g0(r90 r90Var, lnm lnmVar) {
        super(lnmVar);
        this.c = r90Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
