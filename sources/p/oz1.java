package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oz1 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oj80 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz1(oj80 oj80Var, onm onmVar) {
        super(onmVar);
        this.c = oj80Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.g(null, this);
    }
}
