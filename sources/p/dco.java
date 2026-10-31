package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dco extends onm {
    public String a;
    public i24 b;
    public xgn0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ eco e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dco(eco ecoVar, onm onmVar) {
        super(onmVar);
        this.e = ecoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
