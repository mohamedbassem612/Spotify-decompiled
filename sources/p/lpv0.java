package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lpv0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ln1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpv0(ln1 ln1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = ln1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
