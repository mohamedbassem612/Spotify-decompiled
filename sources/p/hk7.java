package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hk7 extends onm {
    public String a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ik7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk7(ik7 ik7Var, onm onmVar) {
        super(onmVar);
        this.d = ik7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
