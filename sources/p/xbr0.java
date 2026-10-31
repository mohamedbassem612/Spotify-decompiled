package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xbr0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zbr0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbr0(zbr0 zbr0Var, onm onmVar) {
        super(onmVar);
        this.b = zbr0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
