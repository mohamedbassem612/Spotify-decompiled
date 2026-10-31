package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eu00 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fu00 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu00(fu00 fu00Var, onm onmVar) {
        super(onmVar);
        this.b = fu00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.b(this);
    }
}
