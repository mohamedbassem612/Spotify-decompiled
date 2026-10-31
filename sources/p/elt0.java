package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class elt0 extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ r0s0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elt0(r0s0 r0s0Var, onm onmVar) {
        super(onmVar);
        this.d = r0s0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return r0s0.n(this.d, this);
    }
}
