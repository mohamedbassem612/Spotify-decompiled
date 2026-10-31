package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d0d0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ e0d0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0d0(e0d0 e0d0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = e0d0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
