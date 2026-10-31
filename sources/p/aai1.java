package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aai1 extends onm {
    public dai1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dai1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aai1(dai1 dai1Var, onm onmVar) {
        super(onmVar);
        this.c = dai1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
