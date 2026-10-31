package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j740 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ k740 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j740(k740 k740Var, onm onmVar) {
        super(onmVar);
        this.b = k740Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.f((String) null, this);
    }
}
