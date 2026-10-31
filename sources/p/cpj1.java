package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cpj1 extends onm {
    public int a;
    public Object b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gpj1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpj1(gpj1 gpj1Var, onm onmVar) {
        super(onmVar);
        this.e = gpj1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(0, null, this);
    }
}
