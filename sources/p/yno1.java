package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yno1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xoo1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yno1(xoo1 xoo1Var, onm onmVar) {
        super(onmVar);
        this.b = xoo1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, 0L, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
