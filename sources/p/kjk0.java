package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kjk0 extends onm {
    public String a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qjk0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjk0(qjk0 qjk0Var, onm onmVar) {
        super(onmVar);
        this.d = qjk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objA = this.d.a(null, null, null, false, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
