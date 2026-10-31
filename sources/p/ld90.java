package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ld90 extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hl00 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld90(hl00 hl00Var, onm onmVar) {
        super(onmVar);
        this.d = hl00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, null, this);
    }
}
