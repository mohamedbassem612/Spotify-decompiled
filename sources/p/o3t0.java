package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o3t0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ myq0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3t0(myq0 myq0Var, onm onmVar) {
        super(onmVar);
        this.b = myq0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.q((String) null, (String) null, this);
    }
}
