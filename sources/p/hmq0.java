package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hmq0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ imq0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmq0(imq0 imq0Var, onm onmVar) {
        super(onmVar);
        this.b = imq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this, false);
    }
}
