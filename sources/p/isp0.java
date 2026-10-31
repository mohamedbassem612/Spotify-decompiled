package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class isp0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jsp0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isp0(jsp0 jsp0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = jsp0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
