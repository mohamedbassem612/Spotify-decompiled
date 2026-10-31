package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b210 extends onm {
    public c0r a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f210 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b210(f210 f210Var, onm onmVar) {
        super(onmVar);
        this.c = f210Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objA = this.c.a(null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
