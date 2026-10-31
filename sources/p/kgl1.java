package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kgl1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mgl1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgl1(mgl1 mgl1Var, onm onmVar) {
        super(onmVar);
        this.b = mgl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
