package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gv9 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ic9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv9(ic9 ic9Var, onm onmVar) {
        super(onmVar);
        this.c = ic9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.e(false, this);
    }
}
