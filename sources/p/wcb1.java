package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wcb1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ edb1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcb1(edb1 edb1Var, onm onmVar) {
        super(onmVar);
        this.b = edb1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
