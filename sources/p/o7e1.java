package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o7e1 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r7e1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7e1(r7e1 r7e1Var, onm onmVar) {
        super(onmVar);
        this.c = r7e1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.t(false, this);
    }
}
