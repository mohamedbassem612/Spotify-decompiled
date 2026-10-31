package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class an30 extends onm {
    public String a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cn30 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an30(cn30 cn30Var, onm onmVar) {
        super(onmVar);
        this.e = cn30Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
