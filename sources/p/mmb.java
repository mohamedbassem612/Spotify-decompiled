package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mmb extends onm {
    public String a;
    public String b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pmb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmb(pmb pmbVar, onm onmVar) {
        super(onmVar);
        this.e = pmbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, null, this, false);
    }
}
