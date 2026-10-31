package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x8w0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ a9w0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8w0(a9w0 a9w0Var, onm onmVar) {
        super(onmVar);
        this.b = a9w0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
