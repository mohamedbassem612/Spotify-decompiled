package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gc41 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hc41 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc41(hc41 hc41Var, onm onmVar) {
        super(onmVar);
        this.b = hc41Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objH = this.b.h(null, null, this);
        return objH == d9n.a ? objH : new e331(objH);
    }
}
