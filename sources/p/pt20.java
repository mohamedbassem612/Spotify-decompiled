package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pt20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ evz c;
    public vr20 d;
    public Throwable e;
    public int f;
    public int g;
    public long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt20(evz evzVar, lnm lnmVar) {
        super(lnmVar);
        this.c = evzVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect((vr20) null, this);
    }
}
