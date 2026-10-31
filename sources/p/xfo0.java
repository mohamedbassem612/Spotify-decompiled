package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xfo0 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yfo0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfo0(yfo0 yfo0Var, onm onmVar) {
        super(onmVar);
        this.c = yfo0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.setValue((Boolean) null, false, (tv80) null, (lnm) this);
    }
}
