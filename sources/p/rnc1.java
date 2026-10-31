package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rnc1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ dn81 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnc1(dn81 dn81Var, onm onmVar) {
        super(onmVar);
        this.b = dn81Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
