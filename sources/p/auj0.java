package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class auj0 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ buj0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auj0(buj0 buj0Var, onm onmVar) {
        super(onmVar);
        this.c = buj0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objB = this.c.b(null, this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
