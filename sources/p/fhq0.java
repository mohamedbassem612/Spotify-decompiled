package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fhq0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ihq0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhq0(ihq0 ihq0Var, onm onmVar) {
        super(onmVar);
        this.b = ihq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(this);
    }
}
