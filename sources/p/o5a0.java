package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o5a0 extends onm {
    public byte a;
    public int b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ p5a0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5a0(p5a0 p5a0Var, onm onmVar) {
        super(onmVar);
        this.g = p5a0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(0, this);
    }
}
