package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q230 extends onm {
    public String a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wp20 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q230(wp20 wp20Var, onm onmVar) {
        super(onmVar);
        this.d = wp20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= os00.INVALID_ID;
        return this.d.w(null, false, null, this);
    }
}
