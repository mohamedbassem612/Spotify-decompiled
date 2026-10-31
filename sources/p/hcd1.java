package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hcd1 extends onm {
    public int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ icd1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcd1(icd1 icd1Var, onm onmVar) {
        super(onmVar);
        this.d = icd1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(0, this);
    }
}
