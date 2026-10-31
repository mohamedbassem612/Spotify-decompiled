package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ba31 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ca31 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba31(ca31 ca31Var, onm onmVar) {
        super(onmVar);
        this.c = ca31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(false, this);
    }
}
