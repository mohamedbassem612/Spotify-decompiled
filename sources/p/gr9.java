package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gr9 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ kr9 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr9(kr9 kr9Var, onm onmVar) {
        super(onmVar);
        this.b = kr9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(false, this);
    }
}
