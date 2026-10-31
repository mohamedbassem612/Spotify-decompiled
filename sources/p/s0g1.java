package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s0g1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hce1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0g1(hce1 hce1Var, onm onmVar) {
        super(onmVar);
        this.b = hce1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.p((String) null, this);
    }
}
