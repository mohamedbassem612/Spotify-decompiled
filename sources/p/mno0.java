package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mno0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nno0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mno0(nno0 nno0Var, onm onmVar) {
        super(onmVar);
        this.c = nno0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
