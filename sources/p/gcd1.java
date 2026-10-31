package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gcd1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ icd1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcd1(icd1 icd1Var, lnm lnmVar) {
        super(lnmVar);
        this.b = icd1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.invoke(this);
    }
}
