package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vbr extends onm {
    public int a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ toj0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbr(toj0 toj0Var, onm onmVar) {
        super(onmVar);
        this.e = toj0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= os00.INVALID_ID;
        return this.e.x(0, (String) null, (String) null, this);
    }
}
