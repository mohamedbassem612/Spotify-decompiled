package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jsc0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ e8m c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsc0(e8m e8mVar, lnm lnmVar) {
        super(lnmVar);
        this.c = e8mVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
