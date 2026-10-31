package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class efc0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ w0b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efc0(w0b0 w0b0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = w0b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
