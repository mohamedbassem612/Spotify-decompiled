package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s230 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wp20 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s230(wp20 wp20Var, onm onmVar) {
        super(onmVar);
        this.c = wp20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.X(null, null, this);
    }
}
