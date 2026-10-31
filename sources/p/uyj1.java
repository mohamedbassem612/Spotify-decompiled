package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uyj1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ln1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyj1(ln1 ln1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = ln1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
