package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v9f0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ w9f0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9f0(w9f0 w9f0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = w9f0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
