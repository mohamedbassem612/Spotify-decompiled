package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xmj1 extends onm {
    public String a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bnj1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmj1(bnj1 bnj1Var, onm onmVar) {
        super(onmVar);
        this.d = bnj1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this, false);
    }
}
