package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eo51 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jo51 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo51(jo51 jo51Var, onm onmVar) {
        super(onmVar);
        this.b = jo51Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.z1(this);
    }
}
