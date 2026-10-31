package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fxo1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bym1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxo1(bym1 bym1Var, onm onmVar) {
        super(onmVar);
        this.b = bym1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f((xmn1) null, this);
    }
}
