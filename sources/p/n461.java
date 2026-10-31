package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n461 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ tz01 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n461(tz01 tz01Var, onm onmVar) {
        super(onmVar);
        this.b = tz01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objI = this.b.i(null, null, this, false);
        return objI == d9n.a ? objI : new e331(objI);
    }
}
