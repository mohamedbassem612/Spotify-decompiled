package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gb81 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vr51 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb81(vr51 vr51Var, onm onmVar) {
        super(onmVar);
        this.b = vr51Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k(this);
    }
}
