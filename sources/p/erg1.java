package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class erg1 extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hrg1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erg1(hrg1 hrg1Var, onm onmVar) {
        super(onmVar);
        this.c = hrg1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(0, this);
    }
}
