package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class srb1 extends onm {
    public k261 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ trb1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srb1(trb1 trb1Var, onm onmVar) {
        super(onmVar);
        this.c = trb1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.a(this);
    }
}
