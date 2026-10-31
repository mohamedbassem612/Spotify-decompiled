package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tmc1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hp91 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmc1(hp91 hp91Var, onm onmVar) {
        super(onmVar);
        this.b = hp91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
