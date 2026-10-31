package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ova1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ae91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ova1(ae91 ae91Var, lnm lnmVar) {
        super(lnmVar);
        this.c = ae91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
