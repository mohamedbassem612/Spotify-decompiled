package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class itg1 extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hce1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itg1(hce1 hce1Var, onm onmVar) {
        super(onmVar);
        this.c = hce1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.y((String) null, this);
    }
}
