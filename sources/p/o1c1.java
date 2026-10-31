package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o1c1 extends onm {
    public String a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ r1c1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1c1(r1c1 r1c1Var, onm onmVar) {
        super(onmVar);
        this.d = r1c1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, null, this);
    }
}
