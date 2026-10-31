package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bre1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hre1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bre1(hre1 hre1Var, onm onmVar) {
        super(onmVar);
        this.c = hre1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c((String) null, this);
    }
}
