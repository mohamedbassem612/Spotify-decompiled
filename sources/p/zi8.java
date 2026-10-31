package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zi8 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ dj8 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi8(dj8 dj8Var, onm onmVar) {
        super(onmVar);
        this.b = dj8Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.Z0(this);
    }
}
