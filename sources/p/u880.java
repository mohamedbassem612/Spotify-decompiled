package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u880 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ v880 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u880(v880 v880Var, lnm lnmVar) {
        super(lnmVar);
        this.c = v880Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
