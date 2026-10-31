package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j461 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ nl51 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j461(nl51 nl51Var, onm onmVar) {
        super(onmVar);
        this.b = nl51Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objO = this.b.o(null, null, this);
        return objO == d9n.a ? objO : new e331(objO);
    }
}
