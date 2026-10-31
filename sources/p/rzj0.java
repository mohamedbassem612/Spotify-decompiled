package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rzj0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ szj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzj0(szj0 szj0Var, onm onmVar) {
        super(onmVar);
        this.c = szj0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
