package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wx40 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ay40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx40(ay40 ay40Var, onm onmVar) {
        super(onmVar);
        this.b = ay40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
