package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kra1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ asa1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kra1(asa1 asa1Var, onm onmVar) {
        super(onmVar);
        this.b = asa1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, this);
    }
}
