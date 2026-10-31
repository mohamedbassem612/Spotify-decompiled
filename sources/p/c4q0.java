package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c4q0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ g4q0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4q0(g4q0 g4q0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = g4q0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.b(this);
    }
}
