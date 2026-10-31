package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z441 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ a541 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z441(a541 a541Var, onm onmVar) {
        super(onmVar);
        this.b = a541Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == d9n.a ? objA : new pvg1((String) objA);
    }
}
