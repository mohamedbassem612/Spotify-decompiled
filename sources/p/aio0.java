package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aio0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bnj0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aio0(bnj0 bnj0Var, onm onmVar) {
        super(onmVar);
        this.b = bnj0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.j((String) null, this);
    }
}
