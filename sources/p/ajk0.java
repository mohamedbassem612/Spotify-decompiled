package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ajk0 extends onm {
    public String a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bjk0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajk0(bjk0 bjk0Var, onm onmVar) {
        super(onmVar);
        this.d = bjk0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objE = this.d.e(null, this);
        return objE == d9n.a ? objE : new e331(objE);
    }
}
