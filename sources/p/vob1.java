package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vob1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ wob1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vob1(wob1 wob1Var, onm onmVar) {
        super(onmVar);
        this.b = wob1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
