package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b1n extends onm {
    public boolean a;
    public String b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ a2n e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1n(a2n a2nVar, onm onmVar) {
        super(onmVar);
        this.e = a2nVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.v(false, this);
    }
}
