package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mn00 extends onm {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nn00 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn00(nn00 nn00Var, onm onmVar) {
        super(onmVar);
        this.c = nn00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.Q0(0L, 0L, this);
    }
}
