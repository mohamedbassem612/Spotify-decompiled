package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jzi1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ kzi1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzi1(kzi1 kzi1Var, onm onmVar) {
        super(onmVar);
        this.b = kzi1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
