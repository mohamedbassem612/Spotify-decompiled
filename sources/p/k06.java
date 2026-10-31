package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k06 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ g23 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k06(g23 g23Var, onm onmVar) {
        super(onmVar);
        this.b = g23Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.b(null, this);
    }
}
