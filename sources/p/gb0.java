package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gb0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hb0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(hb0 hb0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = hb0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
