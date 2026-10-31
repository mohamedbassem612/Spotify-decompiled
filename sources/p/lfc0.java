package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lfc0 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mfc0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfc0(mfc0 mfc0Var, onm onmVar) {
        super(onmVar);
        this.c = mfc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
