package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hdv0 extends onm {
    public Object a;
    public Throwable b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ jdv0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdv0(jdv0 jdv0Var, onm onmVar) {
        super(onmVar);
        this.e = jdv0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= os00.INVALID_ID;
        return this.e.g(null, null, this);
    }
}
