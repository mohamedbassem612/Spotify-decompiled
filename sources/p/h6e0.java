package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h6e0 extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o860 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6e0(o860 o860Var, onm onmVar) {
        super(onmVar);
        this.d = o860Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objA = this.d.A(null, null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
