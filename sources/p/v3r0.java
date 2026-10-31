package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v3r0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ c3r0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3r0(c3r0 c3r0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = c3r0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
