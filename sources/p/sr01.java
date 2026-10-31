package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sr01 extends onm {
    public su01 a;
    public vr01 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vr01 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr01(vr01 vr01Var, onm onmVar) {
        super(onmVar);
        this.d = vr01Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, this);
    }
}
