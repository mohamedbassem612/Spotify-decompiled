package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kno0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ lno0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kno0(lno0 lno0Var, onm onmVar) {
        super(onmVar);
        this.c = lno0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
