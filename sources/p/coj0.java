package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class coj0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ w6e0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coj0(w6e0 w6e0Var, onm onmVar) {
        super(onmVar);
        this.b = w6e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objT = this.b.t((String) null, (uzq) null, this);
        return objT == d9n.a ? objT : new e331(objT);
    }
}
