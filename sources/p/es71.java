package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class es71 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ ip61 e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es71(ip61 ip61Var, lnm lnmVar) {
        super(lnmVar);
        this.e = ip61Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
