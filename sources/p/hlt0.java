package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hlt0 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dzp0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlt0(dzp0 dzp0Var, onm onmVar) {
        super(onmVar);
        this.c = dzp0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f((String) null, this);
    }
}
