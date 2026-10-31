package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f440 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j440 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f440(j440 j440Var, onm onmVar) {
        super(onmVar);
        this.c = j440Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.setValue((Boolean) null, false, (tv80) null, (lnm) this);
    }
}
