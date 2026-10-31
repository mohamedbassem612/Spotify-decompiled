package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ceu0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jx80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceu0(jx80 jx80Var, lnm lnmVar) {
        super(lnmVar);
        this.c = jx80Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
