package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kp60 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mp60 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp60(mp60 mp60Var, onm onmVar) {
        super(onmVar);
        this.c = mp60Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(false, null, this);
    }
}
