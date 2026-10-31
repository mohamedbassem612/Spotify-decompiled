package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qkt0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ phi0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkt0(phi0 phi0Var, onm onmVar) {
        super(onmVar);
        this.b = phi0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.u((String) null, (bew) null, this);
    }
}
