package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ooy0 extends onm {
    public vr20 a;
    public t601 b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ kge e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooy0(kge kgeVar, lnm lnmVar) {
        super(lnmVar);
        this.e = kgeVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return kge.k(this.e, this);
    }
}
