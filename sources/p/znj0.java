package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class znj0 extends onm {
    public kp00 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w6e0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znj0(w6e0 w6e0Var, onm onmVar) {
        super(onmVar);
        this.c = w6e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        Object objQ = this.c.q((String) null, (kp00) null, (c7g1) null, this);
        return objQ == d9n.a ? objQ : new e331(objQ);
    }
}
