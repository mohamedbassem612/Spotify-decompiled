package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sji1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ tji1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sji1(tji1 tji1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = tji1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
