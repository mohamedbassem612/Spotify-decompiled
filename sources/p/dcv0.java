package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dcv0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ywm0 c;
    public gcz d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcv0(ywm0 ywm0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = ywm0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
