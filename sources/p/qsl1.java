package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qsl1 extends onm {
    public long a;
    public float b;
    public m811 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vsl1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsl1(vsl1 vsl1Var, onm onmVar) {
        super(onmVar);
        this.e = vsl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= os00.INVALID_ID;
        return this.e.d(0L, 0.0f, false, this);
    }
}
