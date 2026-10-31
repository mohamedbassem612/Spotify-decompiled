package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kyb0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ myb0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyb0(myb0 myb0Var, onm onmVar) {
        super(onmVar);
        this.b = myb0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
