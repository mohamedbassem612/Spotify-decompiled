package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kgf1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mgf1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgf1(mgf1 mgf1Var, onm onmVar) {
        super(onmVar);
        this.b = mgf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
