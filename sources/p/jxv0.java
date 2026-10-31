package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jxv0 extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kxv0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxv0(kxv0 kxv0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = kxv0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.invoke(this);
    }
}
