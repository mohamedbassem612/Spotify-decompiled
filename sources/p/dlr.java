package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dlr extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ elr b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlr(elr elrVar, onm onmVar) {
        super(onmVar);
        this.b = elrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
