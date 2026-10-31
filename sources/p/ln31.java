package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ln31 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gn31 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln31(gn31 gn31Var, onm onmVar) {
        super(onmVar);
        this.c = gn31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.n(this);
    }
}
