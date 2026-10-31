package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kt20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ lt20 c;
    public vr20 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt20(lt20 lt20Var, lnm lnmVar) {
        super(lnmVar);
        this.c = lt20Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect((vr20) null, this);
    }
}
