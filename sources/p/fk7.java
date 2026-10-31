package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fk7 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ik7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk7(ik7 ik7Var, onm onmVar) {
        super(onmVar);
        this.b = ik7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
