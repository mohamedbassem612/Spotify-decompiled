package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class du00 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fu00 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du00(fu00 fu00Var, onm onmVar) {
        super(onmVar);
        this.c = fu00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.a(null, this);
    }
}
