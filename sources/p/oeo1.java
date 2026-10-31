package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oeo1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vfo1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeo1(vfo1 vfo1Var, onm onmVar) {
        super(onmVar);
        this.b = vfo1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
