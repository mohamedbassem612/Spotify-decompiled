package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y261 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vr51 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y261(vr51 vr51Var, onm onmVar) {
        super(onmVar);
        this.b = vr51Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objM = this.b.m(null, null, null, false, this);
        return objM == d9n.a ? objM : new e331(objM);
    }
}
