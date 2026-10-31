package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n4u0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ p4u0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4u0(p4u0 p4u0Var, onm onmVar) {
        super(onmVar);
        this.b = p4u0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
