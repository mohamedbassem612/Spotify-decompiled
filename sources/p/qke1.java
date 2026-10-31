package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qke1 extends onm {
    public yfe0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lvc1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qke1(lvc1 lvc1Var, onm onmVar) {
        super(onmVar);
        this.c = lvc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.Q(null, this);
    }
}
