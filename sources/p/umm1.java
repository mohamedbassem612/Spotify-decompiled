package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class umm1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ efb1 e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umm1(efb1 efb1Var, lnm lnmVar) {
        super(lnmVar);
        this.e = efb1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit((Object) null, this);
    }
}
