package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cv9 extends onm {
    public ph1 a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dv9 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv9(dv9 dv9Var, onm onmVar) {
        super(onmVar);
        this.d = dv9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, false, this);
    }
}
