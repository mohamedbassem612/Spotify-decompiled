package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vu20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ipr c;
    public vr20 d;
    public p811 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu20(ipr iprVar, lnm lnmVar) {
        super(lnmVar);
        this.c = iprVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect((vr20) null, this);
    }
}
