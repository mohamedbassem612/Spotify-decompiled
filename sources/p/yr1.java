package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yr1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ zr1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr1(zr1 zr1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = zr1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
