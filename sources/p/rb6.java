package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rb6 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ sb6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb6(sb6 sb6Var, lnm lnmVar) {
        super(lnmVar);
        this.c = sb6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
