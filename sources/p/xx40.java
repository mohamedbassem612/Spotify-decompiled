package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xx40 extends onm {
    public int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ay40 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx40(ay40 ay40Var, onm onmVar) {
        super(onmVar);
        this.d = ay40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objB = this.d.b(this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
