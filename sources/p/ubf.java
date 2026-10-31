package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ubf extends onm {
    public tbf a;
    public String b;
    public mrs0 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vbf f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubf(vbf vbfVar, onm onmVar) {
        super(onmVar);
        this.f = vbfVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
