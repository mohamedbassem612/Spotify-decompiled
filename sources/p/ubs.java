package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ubs extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ pbq b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubs(pbq pbqVar, onm onmVar) {
        super(onmVar);
        this.b = pbqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.q0(null, this);
    }
}
