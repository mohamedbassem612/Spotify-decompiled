package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yf11 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zf11 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf11(zf11 zf11Var, onm onmVar) {
        super(onmVar);
        this.b = zf11Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
