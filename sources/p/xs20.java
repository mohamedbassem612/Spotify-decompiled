package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xs20 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ cu b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs20(cu cuVar, lnm lnmVar) {
        super(lnmVar);
        this.b = cuVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit((Object) null, this);
    }
}
