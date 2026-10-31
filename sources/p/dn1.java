package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dn1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ en1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn1(en1 en1Var, onm onmVar) {
        super(onmVar);
        this.b = en1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.t(null, this);
    }
}
