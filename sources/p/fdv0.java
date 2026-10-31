package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fdv0 extends onm {
    public u7g1 a;
    public mbl b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jdv0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdv0(jdv0 jdv0Var, onm onmVar) {
        super(onmVar);
        this.d = jdv0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= os00.INVALID_ID;
        return this.d.e(null, this);
    }
}
