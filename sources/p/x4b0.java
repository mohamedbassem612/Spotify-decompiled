package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x4b0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nw9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4b0(nw9 nw9Var, lnm lnmVar) {
        super(lnmVar);
        this.c = nw9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
